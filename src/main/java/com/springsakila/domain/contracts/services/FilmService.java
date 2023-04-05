package com.springsakila.domain.contracts.services;


import com.springsakila.domain.core.contracts.services.BaseService;
import com.springsakila.domain.core.contracts.services.ProjectionDomainService;
import com.springsakila.domain.entities.Film;

public interface FilmService extends ProjectionDomainService<Film, Integer>, BaseService<Film,
        Integer> {

}
