package com.springsakila.domain.contracts.repositories;

import com.springsakila.domain.core.contracts.repositories.RepositoryWithProjections;
import com.springsakila.domain.entities.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CharacterRepository extends JpaRepository<Character, Integer>, JpaSpecificationExecutor<Character>,
        RepositoryWithProjections {
}
