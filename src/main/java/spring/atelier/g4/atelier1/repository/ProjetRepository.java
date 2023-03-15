package spring.atelier.g4.atelier1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import spring.atelier.g4.atelier1.models.Projet;

public interface ProjetRepository extends JpaRepository<Projet,Long>{


}
