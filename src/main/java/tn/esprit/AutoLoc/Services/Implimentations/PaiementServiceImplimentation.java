package tn.esprit.AutoLoc.Services.Implimentations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.Repository.PaiementRepository;
import tn.esprit.AutoLoc.Services.Interfaces.IPaiementService;
import tn.esprit.AutoLoc.domain.Paiement;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementServiceImplimentation implements IPaiementService {
    PaiementRepository PaiementRepository;

    public List<Paiement> retrieveAllPaiements(){
        return PaiementRepository.findAll();
    }

    public Paiement retrievePaiement(Long idPaiement){
        return PaiementRepository.findById(idPaiement).get();
    }
    public Paiement addPaiement(Paiement Paiement){
        return PaiementRepository.save(Paiement);
    }
    public Paiement modifierPaiement(Paiement Paiement){
        return PaiementRepository.save(Paiement);
    }
    public void removePaiement(Long idPaiement){
        PaiementRepository.deleteById(idPaiement);
    }

}
