package tn.esprit.AutoLoc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AutoLoc.domain.Equipement;

public interface PaiementRepository extends JpaRepository<Equipement,Long> {
}
