package com.example.dashboardBackend.DAO;


import com.example.dashboardBackend.Entity.Mouvement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface MouvementRepository extends JpaRepository<Mouvement,Long> {
}
