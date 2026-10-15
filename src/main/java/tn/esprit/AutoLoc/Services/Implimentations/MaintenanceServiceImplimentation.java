package tn.esprit.AutoLoc.Services.Implimentations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.Repository.MaintenanceRepository;
import tn.esprit.AutoLoc.Services.Interfaces.IMaintenanceService;
import tn.esprit.AutoLoc.domain.Maintenance;

import java.util.List;


@Service
@AllArgsConstructor
public class MaintenanceServiceImplimentation implements IMaintenanceService {
    MaintenanceRepository MaintenanceRepository;

    public List<Maintenance> retrieveAllMaintenances(){
        return MaintenanceRepository.findAll();
    }

    public Maintenance retrieveMaintenance(Long idMaintenance){
        return MaintenanceRepository.findById(idMaintenance).get();
    }
    public Maintenance addMaintenance(Maintenance Maintenance){
        return MaintenanceRepository.save(Maintenance);
    }
    public Maintenance modifierMaintenance(Maintenance Maintenance){
        return MaintenanceRepository.save(Maintenance);
    }
    public void removeMaintenance(Long idMaintenance){
        MaintenanceRepository.deleteById(idMaintenance);
    }


}
