package com.leratoletsepe.expensetracker.repositories;

import com.leratoletsepe.expensetracker.domain.User;
import com.leratoletsepe.expensetracker.excpetions.EtAuthException;

public class UserRepositoryImpl implements UserRespository {
    @Override
    public Integer create(String firstName, String lastName, String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public User findByEmailAndPassword(String email, String password) throws EtAuthException {
        return null;
    }

    @Override
    public Integer getCountByEmail(String email) {
        return null;
    }

    @Override
    public User findById(Integer userId) {
        return null;
    }
}
