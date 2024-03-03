package ma.enset.jpa.repositories;

import ma.enset.jpa.entities.Médecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedecinRepository extends JpaRepository<Médecin,Long> {
    Médecin findByNom(String nom);
}
