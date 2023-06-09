package com.springsakila.inventory.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springsakila.inventory.domain.core.entities.EntityBase;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the category database table.
 */
@Entity
@Table(name = "category")
@NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c")
public class Category extends EntityBase<Category> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", unique = true, nullable = false)
    @Max(255)
    private int categoryId;

    @Column(name = "last_update", insertable = false, updatable = false, nullable = false)
    @JsonIgnore
    private Timestamp lastUpdate;

    @Column(nullable = false, length = 25, unique = true)
    private String name;

    //bidirectional many-to-one association to FilmCategory
    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<FilmCategory> filmCategories;

    protected Category() {
    }

    protected Category(int id) {
        super();
        this.categoryId = id;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    protected void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    protected void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public List<FilmCategory> getFilmCategories() {
        return this.filmCategories;
    }

    protected void setFilmCategories(List<FilmCategory> filmCategories) {
        this.filmCategories = filmCategories;
    }

    public FilmCategory addFilmCategory(FilmCategory filmCategory) {
        getFilmCategories().add(filmCategory);
        filmCategory.setCategory(this);

        return filmCategory;
    }

    public FilmCategory removeFilmCategory(FilmCategory filmCategory) {
        getFilmCategories().remove(filmCategory);
        filmCategory.setCategory(null);

        return filmCategory;
    }

}