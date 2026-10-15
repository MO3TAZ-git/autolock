package tn.esprit.AutoLoc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AutoLoc.Services.Interfaces.IContratService;
import tn.esprit.AutoLoc.Services.Interfaces.IEquipementService;
import tn.esprit.AutoLoc.domain.Equipement;

import java.util.List;

@RestController
@RequestMapping("/Equipement")
@AllArgsConstructor
public class EquipementController {
    final IEquipementService equipementService;
    @GetMapping("/retrieve_equipements")
    public List<Equipement> retrieveAllEquipements() {
        return equipementService.retrieveAllEquipements();
    }
    @GetMapping("/retrieve_equipement/{id}")
    public Equipement retrieveEquipement(@PathVariable("id") Long idEquipement) {
        return equipementService.retrieveEquipement(idEquipement);
    }
    @PostMapping("/addEquipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }
    @PutMapping("/modifierEquipement")
    public  Equipement updateEquipement(@RequestBody Equipement equipement) {
        return equipementService.modifierEquipement(equipement);
    }
    @DeleteMapping("/supprimerEquiepement/{id}")
    public void supprimerEquipement(@PathVariable("id") Long idEquipement) {
        equipementService.removeEquipement(idEquipement);
    }


}



