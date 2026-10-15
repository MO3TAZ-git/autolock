package tn.esprit.AutoLoc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AutoLoc.Services.Interfaces.IPaiementService;
import tn.esprit.AutoLoc.domain.Paiement;

import java.util.List;
@RestController
@RequestMapping("/Paiement")
@AllArgsConstructor
public class PaiementController {
    final IPaiementService paiementService;
    @GetMapping("/retrieve_Paiements")
    public List<Paiement> retrieveAllPaiements() {
        return paiementService.retrieveAllPaiements();
    }
    @GetMapping("/retrieve_Paiement/{id}")
    public Paiement retrievePaiement(@PathVariable("id") Long idPaiement) {
        return paiementService.retrievePaiement(idPaiement);
    }
    @PostMapping("/addPaiement")
    public Paiement addPaiement(@RequestBody Paiement Paiement) {
        return paiementService.addPaiement(Paiement);
    }
    @PutMapping("/modifierPaiement")
    public  Paiement updatePaiement(@RequestBody Paiement Paiement) {
        return paiementService.modifierPaiement(Paiement);
    }
    @DeleteMapping("/supprimerEquiepement/{id}")
    public void supprimerPaiement(@PathVariable("id") Long idPaiement) {
        paiementService.removePaiement(idPaiement);
    }
}
