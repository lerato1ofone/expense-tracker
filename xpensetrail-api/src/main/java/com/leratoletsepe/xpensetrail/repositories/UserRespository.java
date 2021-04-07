package com.leratoletsepe.xpensetrail.repositories;

import com.leratoletsepe.xpensetrail.domain.User;
import com.leratoletsepe.xpensetrail.excpetions.EtAuthException;

public interface UserRespository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws  EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}