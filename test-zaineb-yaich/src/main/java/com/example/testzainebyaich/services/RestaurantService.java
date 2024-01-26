package com.example.testzainebyaich.services;

import com.example.testzainebyaich.entities.Client;
import com.example.testzainebyaich.entities.Restaurant;

import java.util.List;

public interface RestaurantService {
    List<Restaurant> getAllRestaurant();
    Client addRestaurant(Restaurant e);
    void removeRestaurant(Long id);
    Client modifyRestaurant (Restaurant e, Long id);

}
