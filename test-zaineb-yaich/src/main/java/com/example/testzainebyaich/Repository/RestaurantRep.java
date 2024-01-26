package com.example.testzainebyaich.Repository;

import com.example.testzainebyaich.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRep extends JpaRepository<Restaurant, Long> {
}
