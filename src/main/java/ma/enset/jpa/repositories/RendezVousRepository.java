package ma.enset.jpa.repositories;

import ma.enset.jpa.entities.Médecin;
import ma.enset.jpa.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
}
