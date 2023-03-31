package com.springsakila.inventory.domain.contracts.repositories;

import com.springsakila.inventory.domain.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface LanguageRepository extends JpaRepository<Language, Integer>, JpaSpecificationExecutor<Language>,
        RepositoryWithProjections {
}
