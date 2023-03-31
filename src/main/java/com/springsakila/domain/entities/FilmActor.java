package com.springsakila.domain.entities;

import com.springsakila.domain.core.entities.EntityBase;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the film_actor database table.
 */
@Entity
@Table(name = "film_actor")
@NamedQuery(name = "FilmActor.findAll", query = "SELECT f FROM FilmActor f")
public class FilmActor extends EntityBase<FilmActor> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private FilmActorPK id;

    @Column(name = "last_update", nullable = false)
    private Timestamp lastUpdate;

    //bi-directional many-to-one association to Actor
    @ManyToOne
    @JoinColumn(name = "actor_id", nullable = false, insertable = false, updatable = false)
    private Actor actor;

    //bi-directional many-to-one association to Film
    @ManyToOne
    @JoinColumn(name = "film_id", nullable = false, insertable = false, updatable = false)
    private Film film;

    public FilmActor() {
    }

    public FilmActor(Film film, Actor actor) {
        super();
        this.actor = actor;
        this.film = film;
    }

    public FilmActorPK getId() {
        return this.id;
    }

    protected void setId(FilmActorPK id) {
        this.id = id;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    protected void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Actor getActor() {
        return this.actor;
    }

    protected void setActor(Actor actor) {
        this.actor = actor;
    }

    public Film getFilm() {
        return this.film;
    }

    protected void setFilm(Film film) {
        this.film = film;
    }

}