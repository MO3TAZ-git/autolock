package tn.esprit.AutoLoc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AutoLoc.domain.Employe;
import tn.esprit.AutoLoc.domain.Reservation;

public interface EmployeRepository extends JpaRepository<Employe,Long> {

}
