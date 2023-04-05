package com.springsakila.domain.contracts.services;


import com.springsakila.domain.core.contracts.services.BaseService;
import com.springsakila.domain.core.contracts.services.ProjectionDomainService;
import com.springsakila.domain.entities.Character;

public interface CharacterService extends ProjectionDomainService<Character, Integer>, BaseService<Character,
        Integer> {

}
