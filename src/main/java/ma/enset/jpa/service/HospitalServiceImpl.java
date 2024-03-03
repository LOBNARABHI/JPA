package ma.enset.jpa.service;

import ma.enset.jpa.entities.Consultation;
import ma.enset.jpa.entities.Médecin;
import ma.enset.jpa.entities.Patient;
import ma.enset.jpa.entities.RendezVous;
import ma.enset.jpa.repositories.ConsultationRepository;
import ma.enset.jpa.repositories.MedecinRepository;
import ma.enset.jpa.repositories.PatientRepository;
import ma.enset.jpa.repositories.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceImpl implements IHospitalService {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private MedecinRepository medecinRepository;
    @Autowired
    private RendezVousRepository rendezVousRepository;
    @Autowired
    private ConsultationRepository consultationRepository;
    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Optional<Patient> consulterPatient(Long id) {
        return patientRepository.findById(id);
    }

    @Override
    public Patient chercherPatients(String nom) {
        return  patientRepository.findByNom(nom);
    }

    @Override
    public List<Patient> consulterTousLesPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient mettreAJourPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void supprimerPatient(Long id) {
        patientRepository.deleteById(id);
    }


    @Override
    public Médecin saveMedecin(Médecin médecin) {
        return medecinRepository.save(médecin);
    }

    @Override
    public Médecin chercherMedecin(String nom) {
        return  medecinRepository.findByNom(nom);    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Optional<RendezVous> consulterRDV(Long id) {
        return rendezVousRepository.findById(id);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
