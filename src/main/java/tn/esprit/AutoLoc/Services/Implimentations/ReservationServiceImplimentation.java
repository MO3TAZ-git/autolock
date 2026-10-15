package tn.esprit.AutoLoc.Services.Implimentations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.Repository.ReservationRepository;
import tn.esprit.AutoLoc.Services.Interfaces.IReservationService;
import tn.esprit.AutoLoc.domain.Reservation;

import java.util.List;


@Service
@AllArgsConstructor
public class ReservationServiceImplimentation implements IReservationService{
    ReservationRepository ReservationRepository;

    public List<Reservation> retrieveAllReservations(){
        return ReservationRepository.findAll();
    }

    public Reservation retrieveReservation(Long idReservation){
        return ReservationRepository.findById(idReservation).get();
    }
    public Reservation addReservation(Reservation Reservation){
        return ReservationRepository.save(Reservation);
    }
    public Reservation modifierReservation(Reservation Reservation){
        return ReservationRepository.save(Reservation);
    }
    public void removeReservation(Long idReservation){
        ReservationRepository.deleteById(idReservation);
    }

}
