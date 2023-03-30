package com.springsakila.inventory.domain.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Film {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "film_id")
    private Object filmId;

    public Object getFilmId() {
        return filmId;
    }

    public void setFilmId(Object filmId) {
        this.filmId = filmId;
    }

    @Basic
    @Column(name = "title")
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "release_year")
    private Object releaseYear;

    public Object getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Object releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Basic
    @Column(name = "language_id")
    private Object languageId;

    public Object getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Object languageId) {
        this.languageId = languageId;
    }

    @Basic
    @Column(name = "original_language_id")
    private Object originalLanguageId;

    public Object getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(Object originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    @Basic
    @Column(name = "rental_duration")
    private Object rentalDuration;

    public Object getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Object rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    @Basic
    @Column(name = "rental_rate")
    private BigDecimal rentalRate;

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    @Basic
    @Column(name = "length")
    private Object length;

    public Object getLength() {
        return length;
    }

    public void setLength(Object length) {
        this.length = length;
    }

    @Basic
    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    @Basic
    @Column(name = "rating")
    private Object rating;

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "special_features")
    private Object specialFeatures;

    public Object getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(Object specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(filmId, film.filmId) && Objects.equals(title, film.title) && Objects.equals(description
                , film.description) && Objects.equals(releaseYear, film.releaseYear) && Objects.equals(languageId,
                film.languageId) && Objects.equals(originalLanguageId, film.originalLanguageId) && Objects.equals(rentalDuration, film.rentalDuration) && Objects.equals(rentalRate, film.rentalRate) && Objects.equals(length, film.length) && Objects.equals(replacementCost, film.replacementCost) && Objects.equals(rating, film.rating) && Objects.equals(specialFeatures, film.specialFeatures) && Objects.equals(lastUpdate, film.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, title, description, releaseYear, languageId, originalLanguageId, rentalDuration,
                rentalRate, length, replacementCost, rating, specialFeatures, lastUpdate);
    }
}
