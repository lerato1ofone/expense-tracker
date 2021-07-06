package com.leratoletsepe.expensetracker.services;

import com.leratoletsepe.expensetracker.domain.Category;
import com.leratoletsepe.expensetracker.excpetions.EtBadRequestException;
import com.leratoletsepe.expensetracker.excpetions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories(Integer userId);

    Category getCategoryById(Integer userId, Integer category) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}