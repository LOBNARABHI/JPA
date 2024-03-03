package ma.enset.jpa.service;

import ma.enset.jpa.entities.Consultation;
import ma.enset.jpa.entities.Médecin;
import ma.enset.jpa.entities.Patient;
import ma.enset.jpa.entities.RendezVous;

import java.util.List;
import java.util.Optional;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Optional<Patient> consulterPatient(Long id);
    Patient chercherPatients(String nom);
    List<Patient> consulterTousLesPatients();
    Patient mettreAJourPatient(Patient patient);
    void supprimerPatient(Long id);
    Médecin saveMedecin(Médecin médecin);
    Médecin chercherMedecin(String nom);
    RendezVous saveRendezVous(RendezVous rendezVous);
    Optional<RendezVous> consulterRDV(Long id);

    Consultation saveConsultation(Consultation consultation);
}
