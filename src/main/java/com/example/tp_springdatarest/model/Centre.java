package com.example.tp_springdatarest.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "centres")
public class Centre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "nom_centre", nullable = false)
    String nom;

    @Column(name = "adresse_centre")
    String adresse;


    @OneToMany(mappedBy = "centre", fetch = FetchType.LAZY)
    List<Etudiant> etudiants;
}