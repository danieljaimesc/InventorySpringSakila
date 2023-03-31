package com.springsakila.domain.contracts.services;


import com.springsakila.domain.core.contracts.services.ProjectionDomainService;
import com.springsakila.domain.entities.Language;

import java.sql.Timestamp;
import java.util.List;

public interface LanguageService extends ProjectionDomainService<Language, Integer> {
    List<Language> novedades(Timestamp fecha);

}
