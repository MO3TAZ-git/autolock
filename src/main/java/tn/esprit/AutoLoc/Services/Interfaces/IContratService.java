package tn.esprit.AutoLoc.Services.Interfaces;

import tn.esprit.AutoLoc.Repository.ContratRepository;
import tn.esprit.AutoLoc.Repository.ContratRepository;
import tn.esprit.AutoLoc.domain.Contrat;

import java.util.List;

public interface IContratService {
    public List<Contrat> retrieveAllContrats();

    public Contrat retrieveContrat(Long idContrat);
    public Contrat addContrat(Contrat a);

    public Contrat modifierContrat(Contrat a);

    public void removeContrat(Long id);
    
    
}
