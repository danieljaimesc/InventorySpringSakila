package com.springsakila.domain.contracts.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface RepositoryWithProjections {
    <T> List<T> findAllBy(Class<T> tipo);

    <T> Iterable<T> findAllBy(Sort orden, Class<T> tipo);

    <T> Page<T> findAllBy(Pageable page, Class<T> tipo);
}
