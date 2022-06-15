package com.example.dashboardBackend.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="Mvm_Type" ,discriminatorType = DiscriminatorType.STRING,length = 10)
public   class Mouvement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long ctrl;
    private String nomFichier;
    private Double montantMvt ;
    private String nomterme;
    private String sensMvt;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date mvtDate;
    @ManyToOne
    private Compte compte;


}
