package com.springsakila.domain.contracts.repositories;

import com.springsakila.domain.core.contracts.repositories.RepositoryWithProjections;
import com.springsakila.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.sql.Timestamp;
import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer>, JpaSpecificationExecutor<Category>,
        RepositoryWithProjections {
    List<Category> findByLastUpdateGreaterThanEqualOrderByLastUpdate(Timestamp date);
}
