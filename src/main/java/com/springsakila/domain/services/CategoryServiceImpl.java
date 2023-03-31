package com.springsakila.domain.services;

import com.springsakila.shared.exceptions.DuplicateKeyException;
import com.springsakila.shared.exceptions.InvalidDataException;
import com.springsakila.shared.exceptions.NotFoundException;
import com.springsakila.domain.contracts.repositories.CategoryRepository;
import com.springsakila.domain.contracts.services.CategoryService;
import com.springsakila.domain.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository dao;

    @Override
    public List<Category> getAll() {
        return null;
    }

    @Override
    public Optional<Category> getOne(Integer id) {
        return Optional.empty();
    }

    @Override
    public Category add(Category item) throws DuplicateKeyException, InvalidDataException {
        return null;
    }

    @Override
    public Category modify(Category item) throws NotFoundException, InvalidDataException {
        return null;
    }

    @Override
    public void delete(Category item) throws InvalidDataException {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Iterable<Category> getAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Category> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public <T> List<T> getByProjection(Class<T> type) {
        return null;
    }

    @Override
    public <T> Iterable<T> getByProjection(Sort sort, Class<T> type) {
        return null;
    }

    @Override
    public <T> Page<T> getByProjection(Pageable pageable, Class<T> type) {
        return null;
    }

    @Override
    public List<Category> novedades(Timestamp date) {
        return null;
    }
}
