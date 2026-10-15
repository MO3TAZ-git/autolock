package tn.esprit.AutoLoc.Services.Interfaces;

import tn.esprit.AutoLoc.domain.Vehicule;

import java.util.List;


public interface IVehiculeService {
    public List<Vehicule> retrieveAllVehicules();

    public Vehicule retrieveVehicule(Long idVehicule);
    public Vehicule addVehicule(Vehicule a);

    public Vehicule modifierVehicule(Vehicule a);

    public void removeVehicule(Long id);
    
}
