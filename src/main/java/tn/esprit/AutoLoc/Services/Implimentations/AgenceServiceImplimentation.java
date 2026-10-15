package tn.esprit.AutoLoc.Services.Implimentations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.Repository.AgenceRepository;
import tn.esprit.AutoLoc.Services.Interfaces.IAgenceService;
import tn.esprit.AutoLoc.domain.Agence;

import java.util.List;

@Service
@AllArgsConstructor

public class AgenceServiceImplimentation implements IAgenceService {
    AgenceRepository agenceRepository;
    public List<Agence> retrieveAllAgences() {
        return agenceRepository.findAll();
    }
    public Agence retrieveAgence(Long idAgence){
        return agenceRepository.findById(idAgence).get();
    }
    public Agence addAgence(Agence a) {
        return agenceRepository.save(a);
    }
    public Agence modifierAgence(Agence a) {
        return agenceRepository.save(a);
    }
    public void removeAgence(Long idAgence){
        agenceRepository.deleteById(idAgence);
    }
}

