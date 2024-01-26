package com.example.testzainebyaich.services.Impl;

import com.example.testzainebyaich.entities.Client;
import com.example.testzainebyaich.services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Primary
@Service("ClientImpl")
@AllArgsConstructor
public class ClientImpl implements ClientService {
    @Override
    public List<Client> getAllClient() {
        return null;
    }

    @Override
    public Client addClient(Client e) {
        return null;
    }

    @Override
    public void removeClient(Long id) {

    }

    @Override
    public Client modifyClient(Client e, Long id) {
        return null;
    }
}
