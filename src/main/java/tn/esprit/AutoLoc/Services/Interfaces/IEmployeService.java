package tn.esprit.AutoLoc.Services.Interfaces;

import tn.esprit.AutoLoc.domain.Employe;

import java.util.List;

public interface IEmployeService {
    public List<Employe> retrieveAllEmployes();

    public Employe retrieveEmploye(Long idEmploye);
    public Employe addEmploye(Employe a);

    public Employe modifierEmploye(Employe a);

    public void removeEmploye(Long id);
}
