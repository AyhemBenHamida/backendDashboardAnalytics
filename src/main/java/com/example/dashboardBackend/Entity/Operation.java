package com.example.dashboardBackend.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Operation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lib_typ_op;
    private String lib_op_long;
    private String lib_op_court;
    private String lib_nat_op;

    @OneToMany(mappedBy = "operation",cascade = CascadeType.ALL)
    private Collection<MouvementCarnet>mouvements;
}
