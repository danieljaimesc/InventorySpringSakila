package com.springsakila.inventory.domain.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@jakarta.persistence.Table(name = "film_actor", schema = "sakila", catalog = "")
@IdClass(com.springsakila.inventory.domain.entities.FilmActorPK.class)
public class FilmActor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "actor_id")
    private Object actorId;

    public Object getActorId() {
        return actorId;
    }

    public void setActorId(Object actorId) {
        this.actorId = actorId;
    }

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
        FilmActor filmActor = (FilmActor) o;
        return Objects.equals(actorId, filmActor.actorId) && Objects.equals(filmId, filmActor.filmId) && Objects.equals(lastUpdate, filmActor.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId, filmId, lastUpdate);
    }
}
