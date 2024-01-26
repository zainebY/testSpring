package com.example.testzainebyaich.services.Impl;

import com.example.testzainebyaich.entities.Client;
import com.example.testzainebyaich.entities.Composant;
import com.example.testzainebyaich.services.ComposantService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Primary
@Service("ComposantImpl")
@AllArgsConstructor
public class ComposantImpl implements ComposantService {
    @Override
    public List<Composant> getAllComposant() {
        return null;
    }

    @Override
    public Client addComposant(Composant e) {
        return null;
    }

    @Override
    public void removeComposant(Long id) {

    }

    @Override
    public Client modifyComposant(Composant e, Long id) {
        return null;
    }
}
