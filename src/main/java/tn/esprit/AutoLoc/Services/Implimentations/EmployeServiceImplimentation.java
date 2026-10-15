package tn.esprit.AutoLoc.Services.Implimentations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.Repository.EmployeRepository;
import tn.esprit.AutoLoc.Services.Interfaces.IEmployeService;
import tn.esprit.AutoLoc.domain.Employe;

import java.util.List;
@Service
@AllArgsConstructor
public class EmployeServiceImplimentation implements IEmployeService {
    EmployeRepository EmployeRepository;

    public List<Employe> retrieveAllEmployes(){
        return EmployeRepository.findAll();
    }

    public Employe retrieveEmploye(Long idEmploye){
        return EmployeRepository.findById(idEmploye).get();
    }
    public Employe addEmploye(Employe employe){
        return EmployeRepository.save(employe);
    }
    public Employe modifierEmploye(Employe Employe){
        return EmployeRepository.save(Employe);
    }
    public void removeEmploye(Long idEmploye){
        EmployeRepository.deleteById(idEmploye);
    }

}
