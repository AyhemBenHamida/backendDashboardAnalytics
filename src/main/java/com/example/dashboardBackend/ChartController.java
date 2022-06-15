package com.example.dashboardBackend;

import com.example.dashboardBackend.DAO.*;
import com.example.dashboardBackend.Entity.Agence;
import com.example.dashboardBackend.Entity.Compte;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@CrossOrigin("*")
public class ChartController {

    @Autowired
    private AgenceRepository agenceRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CompteRepository compteRepository;
    @Autowired
    private MouvementRepository mouvementRepository;
    @Autowired
    private ObjectifRepository objectifRepository;
    @Autowired
    private OperationRepository operationRepository;


    @RequestMapping("/pieChart/{id_compte}")
    public Collection<DtoPieChart> pieChart(@PathVariable(value = "id_compte")Long id){
        Compte compte= compteRepository.findById(id).get();

        Collection<DtoPieChart>listforpie=new ArrayList<DtoPieChart>();
        compte.getMouvements().forEach(m->{

            if(m.getSensMvt().equals("D")){
                DtoPieChart dtoPieChart =new DtoPieChart();
                dtoPieChart.setLabel( m.getNomterme());
                dtoPieChart.setValeur(m.getMontantMvt());
                listforpie.add(dtoPieChart);
            }

        });
        return listforpie;

    }






    @Data @NoArgsConstructor
    public class DtoPieChart{
       private Double valeur;
       private String label;
    }

}
