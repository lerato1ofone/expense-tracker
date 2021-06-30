package com.leratoletsepe.expensetracker.services;

import com.leratoletsepe.expensetracker.domain.User;
import com.leratoletsepe.expensetracker.excpetions.EtAuthException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User validateUser(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException {
        return null;
    }
}
