package com.springsakila.domain.contracts.repositories;

import com.springsakila.domain.core.contracts.repositories.RepositoryWithProjections;
import com.springsakila.domain.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.sql.Timestamp;
import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer>, JpaSpecificationExecutor<Film>,
        RepositoryWithProjections {
    List<Film> findByLastUpdateGreaterThanEqualOrderByLastUpdate(Timestamp date);
}
