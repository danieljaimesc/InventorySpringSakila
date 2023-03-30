package com.springsakila.inventory.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="actor")
@NamedQuery(name="Actor.findAll", query="SELECT a FROM Actor a")
public class Actor extends EntityBase<Actor> implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "actor_id", unique = true, nullable = false)
    private int actorId;

    @Column(name = "first_name", nullable = false, length = 45)
    @NotBlank
    @Size(max = 45, min = 2)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 45)
    @Size(max = 45, min = 2)
    @Pattern(regexp = "[A-Z]+", message = "Tiene que estar en mayusculas")
    private String lastName;

    @Column(name = "last_update", insertable = false, updatable = false, nullable = false)
    @PastOrPresent
    private Timestamp lastUpdate;

    //bi-directional many-to-one association to FilmActor
    @OneToMany(mappedBy = "actor", fetch = FetchType.LAZY)
    private List<FilmActor> filmActors = new ArrayList<>();

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<FilmActor> getFilmActors() {
        return this.filmActors;
    }

    public void setFilmActors(List<FilmActor> filmActors) {
        this.filmActors = filmActors;
    }

    public FilmActor addFilmActor(FilmActor filmActor) {
        getFilmActors().add(filmActor);
        //TODO filmActor.setActor(this);
        return filmActor;
    }

    public FilmActor removeFilmActor(FilmActor filmActor) {
        getFilmActors().remove(filmActor);
        //TODO filmActor.setActor(null);
        return filmActor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId, firstName, lastName, lastUpdate);
    }
}
