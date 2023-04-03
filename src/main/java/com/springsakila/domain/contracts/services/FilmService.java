package com.springsakila.domain.contracts.services;


import com.springsakila.domain.core.contracts.services.ProjectionDomainService;
import com.springsakila.domain.entities.Film;

import java.sql.Timestamp;
import java.util.List;

public interface FilmService extends ProjectionDomainService<Film, Integer> {
    List<Film> news(Timestamp date);

}
