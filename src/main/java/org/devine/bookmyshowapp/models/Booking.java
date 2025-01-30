package org.devine.bookmyshowapp.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Booking extends BaseModel{
    @ManyToOne
    private User user;

    @OneToMany
    private List<ShowSeat> showSeats;

    @ManyToOne
    private Show show;

    private int amount;

    @OneToMany
    private List<Payment> payments;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;
}
