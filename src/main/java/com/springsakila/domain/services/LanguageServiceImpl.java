package com.springsakila.domain.services;

import com.springsakila.domain.entities.Language;
import com.springsakila.shared.exceptions.DuplicateKeyException;
import com.springsakila.shared.exceptions.InvalidDataException;
import com.springsakila.shared.exceptions.NotFoundException;
import com.springsakila.domain.contracts.repositories.LanguageRepository;
import com.springsakila.domain.contracts.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    LanguageRepository dao;

    @Override
    public List<Language> getAll() {
        return null;
    }

    @Override
    public Optional<Language> getOne(Integer id) {
        return Optional.empty();
    }

    @Override
    public Language add(Language item) throws DuplicateKeyException, InvalidDataException {
        return null;
    }

    @Override
    public Language modify(Language item) throws NotFoundException, InvalidDataException {
        return null;
    }

    @Override
    public void delete(Language item) throws InvalidDataException {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Iterable<Language> getAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Language> getAll(Pageable pageable) {
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
}
