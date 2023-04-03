package com.springsakila.infrastructure.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.springsakila.domain.entities.Character;
import lombok.Value;

@Value
public class CharacterDTO {
    @JsonProperty("id")
    private int characterId;
    @JsonProperty("nombre")
    private String firstName;
    @JsonProperty("apellidos")
    private String lastName;

    public static CharacterDTO from(Character target) {
        return new CharacterDTO(target.getCharacterId(), target.getFirstName(), target.getLastName());
    }

    public static Character from(CharacterDTO target) {
        return new Character(target.getCharacterId(), target.getFirstName(), target.getLastName());
    }

}
