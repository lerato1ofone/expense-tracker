package com.leratoletsepe.expensetracker.services;

import com.leratoletsepe.expensetracker.domain.Transaction;
import com.leratoletsepe.expensetracker.excpetions.EtBadRequestException;
import com.leratoletsepe.expensetracker.excpetions.EtResourceNotFoundException;
import com.leratoletsepe.expensetracker.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public List<Transaction> getAllTransactions(Integer userId, Integer categoryId) {
        return transactionRepository.findAll(userId, categoryId);
    }

    @Override
    public Transaction getTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException {
        return transactionRepository.findById(userId, categoryId, transactionId);
    }

    @Override
    public Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws EtBadRequestException {
        int transactionId = transactionRepository.create(userId, categoryId, amount, note, transactionDate);
        return  transactionRepository.findById(userId, categoryId, transactionId);
    }

    @Override
    public void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws EtBadRequestException {
        transactionRepository.update(userId, categoryId, transactionId, transaction);
    }

    @Override
    public void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws EtResourceNotFoundException {
        transactionRepository.removeById(userId, categoryId, transactionId);
    }
}
