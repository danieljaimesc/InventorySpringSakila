package com.springsakila.domain.core.contracts.repositories;

import com.springsakila.domain.entities.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.sql.Timestamp;
import java.util.List;

public interface InventoryRepository<E, K> extends JpaRepository<E, K>, JpaSpecificationExecutor<E>,
        RepositoryWithProjections {
    List<E> findByLastUpdateGreaterThanEqualOrderByLastUpdate(Timestamp date);

}
