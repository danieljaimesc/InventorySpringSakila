package com.springsakila.domain.contracts.services;


import com.springsakila.domain.core.contracts.services.ProjectionDomainService;
import com.springsakila.domain.entities.Character;

import java.sql.Timestamp;
import java.util.List;

public interface CharacterService extends ProjectionDomainService<Character, Integer> {
    List<Character> news(Timestamp date);

}
