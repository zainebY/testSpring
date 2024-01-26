package com.example.testzainebyaich.services;

import com.example.testzainebyaich.entities.Client;
import com.example.testzainebyaich.entities.Composant;

import java.util.List;

public interface ComposantService {
    List<Composant> getAllComposant();
    Client addComposant(Composant e);
    void removeComposant(Long id);
    Client modifyComposant (Composant e, Long id);

}
