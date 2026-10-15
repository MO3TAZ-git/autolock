package tn.esprit.AutoLoc.Services.Interfaces;

import tn.esprit.AutoLoc.domain.Equipement;

import java.util.List;

public interface IEquipementService {
    public List<Equipement> retrieveAllEquipements();

    public Equipement retrieveEquipement(Long idEquipement);
    public Equipement addEquipement(Equipement a);

    public Equipement modifierEquipement(Equipement a);

    public void removeEquipement(Long id);
}
