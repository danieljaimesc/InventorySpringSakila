package com.springsakila.domain.contracts.repositories;

import com.springsakila.domain.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FilmRepository extends JpaRepository<Film, Integer>, JpaSpecificationExecutor<Film>,
        RepositoryWithProjections {
}
