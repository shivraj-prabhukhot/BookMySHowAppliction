package org.devine.bookmyshowapp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Screen extends BaseModel{

    private String name;
    @OneToMany
    List<Seat> seats;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    List<Feature> features;
}
