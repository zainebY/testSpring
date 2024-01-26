package com.example.testzainebyaich.services.Impl;

import com.example.testzainebyaich.entities.Client;
import com.example.testzainebyaich.entities.Restaurant;
import com.example.testzainebyaich.services.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@AllArgsConstructor
@Service("RestauranrImpl")
public class RestaurantImpl implements RestaurantService {
    @Override
    public List<Restaurant> getAllRestaurant() {
        return null;
    }

    @Override
    public Client addRestaurant(Restaurant e) {
        return null;
    }

    @Override
    public void removeRestaurant(Long id) {

    }

    @Override
    public Client modifyRestaurant(Restaurant e, Long id) {
        return null;
    }
}
