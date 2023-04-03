package com.springsakila.domain.contracts.services;


import com.springsakila.domain.core.contracts.services.ProjectionDomainService;
import com.springsakila.domain.entities.Actor;

import java.sql.Timestamp;
import java.util.List;

public interface ActorService extends ProjectionDomainService<Actor, Integer> {
    List<Actor> news(Timestamp date);

}
