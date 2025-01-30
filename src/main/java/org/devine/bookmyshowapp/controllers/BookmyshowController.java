package org.devine.bookmyshowapp.controllers;

import org.devine.bookmyshowapp.models.Booking;
import org.devine.bookmyshowapp.models.Seat;
import org.devine.bookmyshowapp.models.Show;
import org.devine.bookmyshowapp.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bookmyshow")
public class BookmyshowController {
    @PostMapping("/bookShow")
    public Booking booksShow(@RequestBody Show show, User user,
                             List<Seat> seats) {
        // Implementation
        return null;
    }

    @GetMapping("/getBooking")
    public ResponseEntity<String> getBooking(@RequestParam String bookingId) {
        // Implementation
        return ResponseEntity.ok().body("Booking found for: " + bookingId);
    }
}
