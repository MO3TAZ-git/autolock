package tn.esprit.AutoLoc.Services.Interfaces;

import tn.esprit.AutoLoc.domain.Client;

import java.util.List;

public interface IClientService {
    public List<Client> retrieveAllClients();

    public Client retrieveClient(Long idClient);
    public Client addClient(Client a);

    public Client modifierClient(Client a);

    public void removeClient(Long id);
}
