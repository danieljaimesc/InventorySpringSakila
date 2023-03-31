package com.springsakila.domain.contracts.services;


import com.springsakila.domain.core.contracts.services.ProjectionDomainService;
import com.springsakila.domain.entities.Category;

import java.sql.Timestamp;
import java.util.List;

public interface CategoryService extends ProjectionDomainService<Category, Integer> {
    List<Category> novedades(Timestamp date);
}
