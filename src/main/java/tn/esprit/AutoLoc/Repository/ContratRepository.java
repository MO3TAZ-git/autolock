package tn.esprit.AutoLoc.Repository;

import tn.esprit.AutoLoc.domain.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContratRepository extends JpaRepository <Contrat,Long> {
}
