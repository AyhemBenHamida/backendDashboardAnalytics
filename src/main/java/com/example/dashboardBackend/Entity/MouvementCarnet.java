package com.example.dashboardBackend.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@DiscriminatorValue("mvt_carte")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MouvementCarnet extends Mouvement{
    private String numCarnet;
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date opDate;
    @ManyToOne
    private  Operation operation;

}
