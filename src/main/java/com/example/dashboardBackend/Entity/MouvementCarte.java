package com.example.dashboardBackend.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("mvt_carnet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MouvementCarte extends Mouvement{
    private String numCarte;
    private Double montant_auto;
    private String montant_compo;

}
