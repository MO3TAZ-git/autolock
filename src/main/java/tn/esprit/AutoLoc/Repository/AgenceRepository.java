package tn.esprit.AutoLoc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AutoLoc.domain.Agence;

public interface AgenceRepository extends JpaRepository<Agence,Long> {
}
