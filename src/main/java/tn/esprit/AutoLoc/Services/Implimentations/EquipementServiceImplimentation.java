package tn.esprit.AutoLoc.Services.Implimentations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.Repository.EquipementRepository;
import tn.esprit.AutoLoc.Services.Interfaces.IEquipementService;
import tn.esprit.AutoLoc.domain.Equipement;

import java.util.List;
@Service
@AllArgsConstructor
public class EquipementServiceImplimentation implements IEquipementService {
    EquipementRepository EquipementRepository;

    public List<Equipement> retrieveAllEquipements(){
        return EquipementRepository.findAll();
    }

    public Equipement retrieveEquipement(Long idEquipement){
        return EquipementRepository.findById(idEquipement).get();
    }
    public Equipement addEquipement(Equipement Equipement){
        return EquipementRepository.save(Equipement);
    }
    public Equipement modifierEquipement(Equipement Equipement){
        return EquipementRepository.save(Equipement);
    }
    public void removeEquipement(Long idEquipement){
        EquipementRepository.deleteById(idEquipement);
    }

}
