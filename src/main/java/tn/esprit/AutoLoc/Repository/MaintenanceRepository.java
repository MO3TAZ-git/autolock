package tn.esprit.AutoLoc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.AutoLoc.domain.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance,Long> {
}
