package tn.esprit.AutoLoc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AutoLoc.Services.Interfaces.IContratService;
import tn.esprit.AutoLoc.domain.Contrat;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/Contrat")
public class ContratController {
    public final IContratService contratService;

    @GetMapping("/retreive_Contrats")
    public List<Contrat> retrieveAllContrats(){
        return contratService.retrieveAllContrats();

    }
    @GetMapping("/retrieve_Contrat/{idContrat}")
    public Contrat retrieveContrat(@PathVariable("idContrat") Long idContrat){
        return contratService.retrieveContrat(idContrat);
    }
    @PostMapping("/addContrat")
    public Contrat addContrat(@RequestBody Contrat a){
        return contratService.addContrat(a);
    }
    @PutMapping("/modifierContrat")
    public Contrat modifier(@RequestBody Contrat a){
        return contratService.modifierContrat(a);
    }
    @DeleteMapping("/removeContrat/{id}")
    public void removeContrat(@PathVariable("id") Long idContrat){
        contratService.removeContrat(idContrat);
    }
}
