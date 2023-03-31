package com.springsakila.domain.services;

import com.springsakila.domain.contracts.services.FilmService;
import com.springsakila.shared.exceptions.DuplicateKeyException;
import com.springsakila.shared.exceptions.InvalidDataException;
import com.springsakila.shared.exceptions.NotFoundException;
import com.springsakila.domain.contracts.repositories.FilmRepository;
import com.springsakila.domain.entities.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    FilmRepository dao;

    @Override
    public List<Film> getAll() {
        return null;
    }

    @Override
    public Optional<Film> getOne(Integer id) {
        return Optional.empty();
    }

    @Override
    public Film add(Film item) throws DuplicateKeyException, InvalidDataException {
        return null;
    }

    @Override
    public Film modify(Film item) throws NotFoundException, InvalidDataException {
        return null;
    }

    @Override
    public void delete(Film item) throws InvalidDataException {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Iterable<Film> getAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Film> getAll(Pageable pageable) {
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
