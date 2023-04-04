package com.springsakila.domain.contracts.services;


import com.springsakila.domain.core.contracts.services.InventoryService;
import com.springsakila.domain.core.contracts.services.ProjectionDomainService;
import com.springsakila.domain.entities.Character;

public interface CharacterService extends ProjectionDomainService<Character, Integer>, InventoryService<Character,
        Integer> {

}
