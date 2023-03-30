package com.springsakila.inventory.domain.contracts.repositories;

import com.springsakila.inventory.domain.entities.Actor;
import com.springsakila.inventory.domain.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FilmRepository extends JpaRepository<Film, Integer>, JpaSpecificationExecutor<Film>,
        RepositoryWithProjections{
}
