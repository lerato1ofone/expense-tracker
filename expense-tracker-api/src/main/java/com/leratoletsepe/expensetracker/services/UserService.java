package com.leratoletsepe.expensetracker.services;

import com.leratoletsepe.expensetracker.domain.User;
import com.leratoletsepe.expensetracker.excpetions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws  EtAuthException;
}