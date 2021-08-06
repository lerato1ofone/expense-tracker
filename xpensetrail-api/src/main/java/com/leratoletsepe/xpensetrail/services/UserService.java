package com.leratoletsepe.xpensetrail.services;

import com.leratoletsepe.xpensetrail.domain.User;
import com.leratoletsepe.xpensetrail.domain.dto.UserDto;
import com.leratoletsepe.xpensetrail.excpetions.EtAuthException;
import com.leratoletsepe.xpensetrail.excpetions.EtResourceNotFoundException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws  EtAuthException;

    UserDto getUser(Integer userId) throws EtResourceNotFoundException;
}