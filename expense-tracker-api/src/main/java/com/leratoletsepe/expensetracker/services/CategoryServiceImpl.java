package com.leratoletsepe.expensetracker.services;

import com.leratoletsepe.expensetracker.domain.Category;
import com.leratoletsepe.expensetracker.excpetions.EtBadRequestException;
import com.leratoletsepe.expensetracker.excpetions.EtResourceNotFoundException;
import com.leratoletsepe.expensetracker.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories(Integer userId) {
        return categoryRepository.findAll(userId);
    }

    @Override
    public Category getCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
        return categoryRepository.findById(userId, categoryId);
    }

    @Override
    public Category addCategory(Integer userId, String title, String description) throws EtBadRequestException {
        int categoryId = categoryRepository.create(userId, title, description);
        return categoryRepository.findById(userId, categoryId);
    }

    @Override
    public void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException {
        categoryRepository.update(userId, categoryId, category);
    }

    @Override
    public void removeCategoryWithAllTransactions(Integer userId, Integer categoryId) throws EtResourceNotFoundException {
        this.getCategoryById(userId, categoryId);
        categoryRepository.removeById(userId, categoryId);
    }
}