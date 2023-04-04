package com.springsakila.domain.contracts.repositories;

import com.springsakila.domain.core.contracts.repositories.RepositoryWithProjections;
import com.springsakila.domain.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.sql.Timestamp;
import java.util.List;

public interface LanguageRepository extends JpaRepository<Language, Integer>, JpaSpecificationExecutor<Language>,
        RepositoryWithProjections {
    List<Language> findByLastUpdateGreaterThanEqualOrderByLastUpdate(Timestamp date);
}
