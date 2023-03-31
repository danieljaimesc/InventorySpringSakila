package com.springsakila.infrastructure.dto;

import com.springsakila.domain.entities.Category;
import com.springsakila.domain.entities.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NovedadesDTO {
    private List<FilmEditDTO> films;
    private List<ActorDTO> actors;
    private List<Category> categories;
    private List<Language> languages;

}
