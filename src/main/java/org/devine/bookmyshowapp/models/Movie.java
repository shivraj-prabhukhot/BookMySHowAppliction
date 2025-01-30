package org.devine.bookmyshowapp.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Movie extends BaseModel{
    private String name;
    @ManyToMany
    private List<Language> languages;
    @ManyToMany
    private List<Actor> actors;
}
