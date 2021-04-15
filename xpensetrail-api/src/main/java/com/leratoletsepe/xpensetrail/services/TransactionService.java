package com.leratoletsepe.xpensetrail.services;

import com.leratoletsepe.xpensetrail.domain.Transaction;
import com.leratoletsepe.xpensetrail.excpetions.EtBadRequestException;
import com.leratoletsepe.xpensetrail.excpetions.EtResourceNotFoundException;

import java.util.List;

public interface TransactionService {

    List<Transaction> getAllTransactions(Integer userId, Integer categoryId);

    Transaction getTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;

    Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException;

    void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException;

    void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException;
}
