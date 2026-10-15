package tn.esprit.AutoLoc.Services.Implimentations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.AutoLoc.Repository.ClientRepository;
import tn.esprit.AutoLoc.Services.Interfaces.IClientService;
import tn.esprit.AutoLoc.domain.Client;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImplimentation implements IClientService {
    ClientRepository clientRepository;

    public List<Client> retrieveAllClients(){
        return clientRepository.findAll();
    }

    public Client retrieveClient(Long idClient){
        return clientRepository.findById(idClient).get();
    }
    public Client addClient(Client client){
        return clientRepository.save(client);
    }
    public Client modifierClient(Client client){
        return clientRepository.save(client);
    }
    public void removeClient(Long idClient){
        clientRepository.deleteById(idClient);
    }



}
