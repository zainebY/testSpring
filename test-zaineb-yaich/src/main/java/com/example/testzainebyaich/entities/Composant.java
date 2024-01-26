package com.example.testzainebyaich.entities;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Composant {
    @Id
    Long idComposant;
    @Column
    String nomComposant;
    @Column
    Float prix;
    @ManyToOne
    Menu menu;



}
