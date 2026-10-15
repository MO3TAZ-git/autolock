package tn.esprit.AutoLoc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AutoLoc.Services.Interfaces.IMaintenanceService;
import tn.esprit.AutoLoc.domain.Maintenance;

import java.util.List;

@RestController
@RequestMapping("/Maintenance")
@AllArgsConstructor
public class MaintenanceController {
    final IMaintenanceService  maintenanceService;
    @GetMapping("/retrieve_Maintenances")
    public List<Maintenance> retrieveAllMaintenances() {
        return maintenanceService.retrieveAllMaintenances();
    }
    @GetMapping("/retrieve_Maintenance/{id}")
    public Maintenance retrieveMaintenance(@PathVariable("id") Long idMaintenance) {
        return maintenanceService.retrieveMaintenance(idMaintenance);
    }
    @PostMapping("/addMaintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance Maintenance) {
        return maintenanceService.addMaintenance(Maintenance);
    }
    @PutMapping("/modifierMaintenance")
    public  Maintenance updateMaintenance(@RequestBody Maintenance Maintenance) {
        return maintenanceService.modifierMaintenance(Maintenance);
    }
    @DeleteMapping("/supprimerEquiepement/{id}")
    public void supprimerMaintenance(@PathVariable("id") Long idMaintenance) {
        maintenanceService.removeMaintenance(idMaintenance);
    }
}
