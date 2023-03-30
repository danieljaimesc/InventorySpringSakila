package com.springsakila.inventory.domain.contracts.repositories;

import com.springsakila.inventory.domain.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ActorRepository extends JpaRepository<Actor, Integer>, JpaSpecificationExecutor<Actor>,
        RepositoryWithProjections {
}
