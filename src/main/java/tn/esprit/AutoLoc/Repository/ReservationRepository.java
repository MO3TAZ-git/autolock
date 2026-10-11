package tn.esprit.AutoLoc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AutoLoc.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
