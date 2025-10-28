package com.example.tp_springdatarest;

import com.example.tp_springdatarest.enums.Genre;
import com.example.tp_springdatarest.model.Centre;
import com.example.tp_springdatarest.model.Etudiant;
import com.example.tp_springdatarest.repositories.CentreRepository;
import com.example.tp_springdatarest.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataBasicApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataBasicApplication.class, args);
    }

    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    CentreRepository centreRepository;

    @Override
    public void run(String... args) throws Exception {
        Etudiant et1 = Etudiant.builder()
                .nom("elkhalfi")
                .prenom("basma")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et1);

        Etudiant et2 = Etudiant.builder()
                .nom("alami")
                .prenom("lina")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et2);

        Etudiant et3 = Etudiant.builder()
                .nom("ijeoui")
                .prenom("hanane")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et3);

        Centre c1 = Centre.builder()
                .nom("Centre Casablanca")
                .adresse("Casablanca")
                .build();
        centreRepository.save(c1);

        Centre c2 = Centre.builder()
                .nom("Centre Rabat")
                .adresse("Rabat")
                .build();
        centreRepository.save(c2);
    }
}
