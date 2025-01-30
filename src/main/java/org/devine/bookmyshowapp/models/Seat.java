package org.devine.bookmyshowapp.models;

import jakarta.persistence.Entity;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int rowValue;
    private int colValue;

    private int seatNumber;
    @ManyToOne
    private SeatType seatType;
}
