package tn.esprit.AutoLoc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AutoLoc.Services.Interfaces.IVehiculeService;
import tn.esprit.AutoLoc.domain.Vehicule;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/Vehicule")
public class VehiculeController {
    final IVehiculeService  vehiculeService;
    @GetMapping("/retrieve_Vehicules")
    public List<Vehicule> retrieveAllVehicules() {
        return vehiculeService.retrieveAllVehicules();
    }
    @GetMapping("/retrieve_Vehicule/{id}")
    public Vehicule retrieveVehicule(@PathVariable("id") Long idVehicule) {
        return vehiculeService.retrieveVehicule(idVehicule);
    }
    @PostMapping("/addVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule Vehicule) {
        return vehiculeService.addVehicule(Vehicule);
    }
    @PutMapping("/modifierVehicule")
    public  Vehicule updateVehicule(@RequestBody Vehicule Vehicule) {
        return vehiculeService.modifierVehicule(Vehicule);
    }
    @DeleteMapping("/supprimerEquiepement/{id}")
    public void supprimerVehicule(@PathVariable("id") Long idVehicule) {
        vehiculeService.removeVehicule(idVehicule);
    }
}
