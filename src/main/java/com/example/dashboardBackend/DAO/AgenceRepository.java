package com.example.dashboardBackend.DAO;


import com.example.dashboardBackend.Entity.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface AgenceRepository  extends JpaRepository<Agence,Long> {
}
