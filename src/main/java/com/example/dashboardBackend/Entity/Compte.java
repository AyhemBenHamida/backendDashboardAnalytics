package com.example.dashboardBackend.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Compte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numCompte;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date dateCreation;
    private Double solde ;
    @OneToOne(mappedBy = "compte")
    private Client client;
    @OneToMany(mappedBy = "compte",cascade = CascadeType.ALL)
    private Collection<Mouvement>mouvements;
    @OneToMany(mappedBy = "compte",cascade = CascadeType.ALL)
    private Collection<Objectif>objectifs;
}
