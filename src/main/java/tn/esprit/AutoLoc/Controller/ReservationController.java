package tn.esprit.AutoLoc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AutoLoc.Services.Interfaces.IReservationService;
import tn.esprit.AutoLoc.domain.Reservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")
public class ReservationController {
    final IReservationService reservationService;
    @GetMapping("/retrieve_Reservations")
    public List<Reservation> retrieveAllReservations() {
        return reservationService.retrieveAllReservations();
    }
    @GetMapping("/retrieve_Reservation/{id}")
    public Reservation retrieveReservation(@PathVariable("id") Long idReservation) {
        return reservationService.retrieveReservation(idReservation);
    }
    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation Reservation) {
        return reservationService.addReservation(Reservation);
    }
    @PutMapping("/modifierReservation")
    public  Reservation updateReservation(@RequestBody Reservation Reservation) {
        return reservationService.modifierReservation(Reservation);
    }
    @DeleteMapping("/supprimerEquiepement/{id}")
    public void supprimerReservation(@PathVariable("id") Long idReservation) {
        reservationService.removeReservation(idReservation);
    }
}
