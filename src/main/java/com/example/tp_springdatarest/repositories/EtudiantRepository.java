package com.example.tp_springdatarest.repositories;

import com.example.tp_springdatarest.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="students")
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}