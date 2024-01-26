package com.example.testzainebyaich.entities;

import com.example.testzainebyaich.entities.Menu;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Restaurant {
    @Id
    Long idRestaurant;
    @Column
    String nom;
    @Column
    Long nbOlacesMax;
    @OneToMany(cascade = CascadeType.ALL)
    Set<Menu> menus;


}
