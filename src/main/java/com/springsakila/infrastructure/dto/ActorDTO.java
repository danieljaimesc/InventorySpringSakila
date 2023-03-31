package com.springsakila.infrastructure.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.springsakila.domain.entities.Actor;
import lombok.Value;

//@Data @AllArgsConstructor @NoArgsConstructor
@Value
public class ActorDTO {
    @JsonProperty("id")
    private int actorId;
    @JsonProperty("nombre")
    private String firstName;
    @JsonProperty("apellidos")
    private String lastName;

    public static ActorDTO from(Actor target) {
        return new ActorDTO(target.getActorId(), target.getFirstName(), target.getLastName());
    }

    public static Actor from(ActorDTO target) {
        return new Actor(target.getActorId(), target.getFirstName(), target.getLastName());
    }

}
