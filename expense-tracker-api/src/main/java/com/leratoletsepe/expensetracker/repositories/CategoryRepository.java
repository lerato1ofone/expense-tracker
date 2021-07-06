package com.leratoletsepe.expensetracker.repositories;

import com.leratoletsepe.expensetracker.domain.Category;
import com.leratoletsepe.expensetracker.excpetions.EtBadRequestException;
import com.leratoletsepe.expensetracker.excpetions.EtResourceNotFoundException;

import java.util.List;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws  EtBadRequestException;

    void removeById(Integer userId, Integer category);
}
