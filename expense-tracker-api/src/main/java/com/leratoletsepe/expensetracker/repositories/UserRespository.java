package com.leratoletsepe.expensetracker.repositories;

import com.leratoletsepe.expensetracker.domain.User;
import com.leratoletsepe.expensetracker.excpetions.EtAuthException;

public interface UserRespository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws  EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}