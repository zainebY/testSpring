package com.example.testzainebyaich.services;

import com.example.testzainebyaich.entities.Client;

import java.util.List;

public interface ClientService {
    List<Client>getAllClient();
    Client addClient(Client e);
    void removeClient(Long id);
    Client modifyClient (Client e, Long id);

}
