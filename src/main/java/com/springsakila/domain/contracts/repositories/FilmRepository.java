package com.springsakila.domain.contracts.repositories;

import com.springsakila.domain.core.contracts.repositories.InventoryRepository;
import com.springsakila.domain.entities.Film;

public interface FilmRepository extends InventoryRepository<Film, Integer> {
}
