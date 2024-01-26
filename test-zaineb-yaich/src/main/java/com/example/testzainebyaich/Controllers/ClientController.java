package com.example.testzainebyaich.Controllers;

import com.example.testzainebyaich.entities.Client;
import com.example.testzainebyaich.services.Impl.ClientImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientImpl clientImpl;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> addClient(@RequestBody Client client){
        Client addedClient = clientImpl.addClient(client);
        return new ResponseEntity<>(addedClient, HttpStatus.CREATED);
    }

}