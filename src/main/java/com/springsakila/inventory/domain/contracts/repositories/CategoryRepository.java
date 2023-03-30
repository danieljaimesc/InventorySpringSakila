package com.springsakila.inventory.domain.contracts.repositories;

import com.springsakila.inventory.domain.entities.Actor;
import com.springsakila.inventory.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoryRepository extends JpaRepository<Category, Integer>, JpaSpecificationExecutor<Category>,
        RepositoryWithProjections{
}
