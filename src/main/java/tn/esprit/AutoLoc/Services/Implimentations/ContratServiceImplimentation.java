package tn.esprit.AutoLoc.Services.Implimentations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.Repository.ContratRepository;
import tn.esprit.AutoLoc.Services.Interfaces.IContratService;
import tn.esprit.AutoLoc.domain.Contrat;

import java.util.List;
@Service
@AllArgsConstructor
public class ContratServiceImplimentation implements IContratService {
    ContratRepository ContratRepository;

    public List<Contrat> retrieveAllContrats(){
        return ContratRepository.findAll();
    }

    public Contrat retrieveContrat(Long idContrat){
        return ContratRepository.findById(idContrat).get();
    }
    public Contrat addContrat(Contrat Contrat){
        return ContratRepository.save(Contrat);
    }
    public Contrat modifierContrat(Contrat Contrat){
        return ContratRepository.save(Contrat);
    }
    public void removeContrat(Long idContrat){
        ContratRepository.deleteById(idContrat);
    }

}
