package tn.esprit.AutoLoc.Services.Interfaces;

import tn.esprit.AutoLoc.domain.Paiement;

import java.util.List;

public interface IPaiementService {
    public List<Paiement> retrieveAllPaiements();

    public Paiement retrievePaiement(Long idPaiement);
    public Paiement addPaiement(Paiement a);

    public Paiement modifierPaiement(Paiement a);

    public void removePaiement(Long id);

}
