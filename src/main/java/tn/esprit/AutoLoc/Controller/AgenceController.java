package tn.esprit.AutoLoc.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AutoLoc.Services.Interfaces.IAgenceService;
import tn.esprit.AutoLoc.domain.Agence;

import java.util.List;
@Tag(name="controlleur des agences")
@RestController
@RequestMapping("/Agence")
@AllArgsConstructor
public class AgenceController {
    public final IAgenceService AgenceService;

    @GetMapping("retrieve_agences")
    public List<Agence> retrieveAgences(){

        return AgenceService.retrieveAllAgences();
    }

    @GetMapping("/retrieve_agence/{id}")
    public Agence retrieveAgence(@PathVariable("id") Long idAgence) {
        return AgenceService.retrieveAgence(idAgence);
    }

    @Operation(description="/ajouter une agence")
    @PostMapping("/AjouterAgence")
    public Agence AjouterAgence(@RequestBody Agence A){
        return AgenceService.addAgence(A);

    }
    @PutMapping("modifierAgence")
    public Agence modifierAgence(@RequestBody Agence A){
        return AgenceService.modifierAgence(A);
    }
    @DeleteMapping("/RemoveAgence/{id}")
    public void RemoveAgence(@PathVariable("id") Long id){
        AgenceService.removeAgence(id);
    }
}
