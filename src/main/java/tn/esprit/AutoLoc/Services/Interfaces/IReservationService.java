package tn.esprit.AutoLoc.Services.Interfaces;

import tn.esprit.AutoLoc.domain.Reservation;

import java.util.List;


public interface IReservationService {
    public List<Reservation> retrieveAllReservations();

    public Reservation retrieveReservation(Long idReservation);
    public Reservation addReservation(Reservation a);

    public Reservation modifierReservation(Reservation a);

    public void removeReservation(Long id);
}
