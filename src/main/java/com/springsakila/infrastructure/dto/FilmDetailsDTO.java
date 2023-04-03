package com.springsakila.infrastructure.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.springsakila.domain.entities.Category;
import com.springsakila.domain.entities.Film;
import lombok.Value;

import java.math.BigDecimal;
import java.util.List;

@Value
public class FilmDetailsDTO {
    private int filmId;
    private String description;
    private int length;
    private String rating;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy")
    private Short releaseYear;
    private byte rentalDuration;
    private BigDecimal rentalRate;
    private BigDecimal replacementCost;
    private String title;
    private String language;
    private String languageVO;
    private List<String> actors;
    private List<String> categories;

    public static FilmDetailsDTO from(Film source) {
        return new FilmDetailsDTO(
                source.getFilmId(),
                source.getDescription(),
                source.getLength(),
                source.getRating().getValue(),
                source.getReleaseYear(),
                source.getRentalDuration(),
                source.getRentalRate(),
                source.getReplacementCost(),
                source.getTitle(),
                source.getLanguage() == null ? null : source.getLanguage().getName(),
                source.getLanguageVO() == null ? null : source.getLanguageVO().getName(),
                source.getActors().stream().map(item -> item.getFirstName() + " " + item.getLastName())
                        .sorted().toList(),
                source.getCategories().stream().map(Category::getName).sorted().toList()
        );
    }
}
