package tn.esprit.AutoLoc.Services.Implimentations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.Repository.VehiculeRepository;
import tn.esprit.AutoLoc.Services.Interfaces.IVehiculeService;
import tn.esprit.AutoLoc.domain.Vehicule;

import java.util.List;
@Service
@AllArgsConstructor
public class VehiculeServiceImplimentation implements IVehiculeService {
    VehiculeRepository VehiculeRepository;

    public List<Vehicule> retrieveAllVehicules(){
        return VehiculeRepository.findAll();
    }

    public Vehicule retrieveVehicule(Long idVehicule){
        return VehiculeRepository.findById(idVehicule).get();
    }
    public Vehicule addVehicule(Vehicule Vehicule){
        return VehiculeRepository.save(Vehicule);
    }
    public Vehicule modifierVehicule(Vehicule Vehicule){
        return VehiculeRepository.save(Vehicule);
    }
    public void removeVehicule(Long idVehicule){
        VehiculeRepository.deleteById(idVehicule);
    }

}
