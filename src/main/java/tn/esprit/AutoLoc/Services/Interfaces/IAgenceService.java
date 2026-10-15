package tn.esprit.AutoLoc.Services.Interfaces;

import tn.esprit.AutoLoc.domain.Agence;

import java.util.List;

public interface IAgenceService {
    public List<Agence> retrieveAllAgences();

    public Agence retrieveAgence(Long idAgence);
    public Agence addAgence(Agence a);

    public Agence modifierAgence(Agence a);

    public void removeAgence(Long id);
}
