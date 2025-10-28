package com.example.tp_springdatarest.repositories;

import com.example.tp_springdatarest.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="centres")
public interface CentreRepository extends JpaRepository<Centre, Long> {
}
