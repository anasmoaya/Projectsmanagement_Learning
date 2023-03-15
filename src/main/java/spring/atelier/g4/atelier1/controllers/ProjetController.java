package spring.atelier.g4.atelier1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import spring.atelier.g4.atelier1.models.Projet;
import spring.atelier.g4.atelier1.repository.ProjetRepository;

import java.util.List;

@RestController
@RequestMapping("/projets")
public class ProjetController {
    @Autowired
    ProjetRepository projetRepository;



    @GetMapping
    List<Projet> getProject(){
        return projetRepository.findAll();
    }

    @PostMapping
    void setProject(Projet p){
        projetRepository.save(p);
    }

    @PutMapping
    void editProject(@RequestBody Projet p){
        Projet ol;
        if(projetRepository.findById(p.getId()).isPresent()){
            ol = projetRepository.findById(p.getId()).get();

            projetRepository.save(ol);
        }


    }

    @GetMapping("/find/id")
    Projet findProjetByid(Long id){
        if(projetRepository.findById(id).isPresent())
        return projetRepository.findById(id).get();
        else
            return null;

    }

}
