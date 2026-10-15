package tn.esprit.AutoLoc.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.AutoLoc.Services.Interfaces.IClientService;
import tn.esprit.AutoLoc.domain.Client;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Client")
public class ClientController {
    public final IClientService clientService;

    @GetMapping("/retreive_Clients")
    public List<Client> retrieveAllClients(){
        return clientService.retrieveAllClients();

    }
    @GetMapping("/retrieve_Client/{idClient}")
    public Client retrieveClient(@PathVariable("idClient") Long idClient){
        return clientService.retrieveClient(idClient);
    }
    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client a){
        return clientService.addClient(a);
    }
    @PutMapping("/modifierClient")
    public Client modifier(@RequestBody Client a){
        return clientService.modifierClient(a);
    }
    @DeleteMapping("/removeClient/{id}")
    public void removeClient(@PathVariable("id") Long idClient){
        clientService.removeClient(idClient);
    }
}
