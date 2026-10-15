package tn.esprit.AutoLoc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AutoLoc.Services.Interfaces.IEmployeService;
import tn.esprit.AutoLoc.domain.Employe;

import java.util.List;

@RestController
@RequestMapping("/Employe")
@AllArgsConstructor
public class EmployeController {
    final IEmployeService employeService;
    @GetMapping("/retrieve_Employes")
    public List<Employe> retrieveAllEmployes(){
        return employeService.retrieveAllEmployes();
    }
    @GetMapping("/retrieve_Employe/{id}")
    public Employe retrieveEmploye(@PathVariable("id") Long idEmploye){
        return employeService.retrieveEmploye(idEmploye);
    }
    @PostMapping("/addEmploye")
    public Employe addEmploye(@RequestBody Employe employe){
        return employeService.addEmploye(employe);
    }
    @PutMapping("/updateEmploye")
    public Employe updateEmploye(@RequestBody Employe employe){
        return employeService.modifierEmploye(employe);
    }
    @DeleteMapping("/deleteEmploye/{idEmploye}")
    public void deleteEmploye(@PathVariable("idEmploye") Long id){
        employeService.removeEmploye(id);
    }
}
