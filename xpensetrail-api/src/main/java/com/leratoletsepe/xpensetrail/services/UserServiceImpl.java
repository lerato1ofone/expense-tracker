package com.leratoletsepe.xpensetrail.services;

import com.leratoletsepe.xpensetrail.domain.User;
import com.leratoletsepe.xpensetrail.excpetions.EtAuthException;
import com.leratoletsepe.xpensetrail.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.regex.Pattern;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRespository userRespository;

    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        if(email != null)
            email = email.toLowerCase();

       return userRespository.findByEmailAndPassword(email, password);
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");

        if(email != null)
            email = email.toLowerCase();

        if(!pattern.matcher(email).matches())
            throw new EtAuthException("Invalid email format");

        Integer count = userRespository.getCountByEmail(email);
        if(count > 0)
            throw new EtAuthException("Email already in use");

        Integer userId = userRespository.create(firstName, lastName, email, password);
        return userRespository.findById(userId);
    }
}