package com.leratoletsepe.xpensetrail.services;

import com.leratoletsepe.xpensetrail.domain.Category;
import com.leratoletsepe.xpensetrail.excpetions.EtBadRequestException;
import com.leratoletsepe.xpensetrail.excpetions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryService {

    List<Category> getAllCategories(Integer userId);

    Category getCategoryById(Integer userId, Integer category) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
}