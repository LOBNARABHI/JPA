package ma.enset.jpa;

import ma.enset.jpa.entities.*;
import ma.enset.jpa.repositories.ConsultationRepository;
import ma.enset.jpa.repositories.MedecinRepository;
import ma.enset.jpa.repositories.PatientRepository;
import ma.enset.jpa.repositories.RendezVousRepository;
import ma.enset.jpa.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpaApplication.class, args);
	}

	/*@Bean  //executer au demarage
	CommandLineRunner start(IHospitalService hospitalService){ //l'injection de dependances
		return args -> {
			Patient patient = new Patient();
			patient.setNom("Lobna");
			patient.setMalade(false);
			patient.setDateNaissance(new Date());
			hospitalService.savePatient(patient);

			Stream.of("amine","fatima", "ghizlane")
					.forEach(name->{
						Médecin médecin = new Médecin();
						médecin.setNom(name);
						médecin.setEmail(name+"@gmail.com");
						médecin.setSpecialite(Math.random()>0.5?"cardio":"Dentiste");
						hospitalService.saveMedecin(médecin);
					});

			Patient patient1 = hospitalService.consulterPatient(1L).orElse(null);
			Patient patient2 = (Patient) hospitalService.chercherPatients("Lobna");

			Médecin médecin = (Médecin) hospitalService.chercherMedecin("fatima");

			RendezVous rendezVous = new RendezVous();
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatusRdv.PENDING);
			rendezVous.setPatient(patient1);
			rendezVous.setMédecin(médecin);
			hospitalService.saveRendezVous(rendezVous);
			System.out.println("le numéro de votre rendez-vous est : " + rendezVous.getId());

			RendezVous rendezVous1 = hospitalService.consulterRDV(1L).orElse(null);
			Consultation consultation = new Consultation();
// Créer une instance de java.sql.Date à partir de java.util.Date
			java.sql.Date sqlDate = new java.sql.Date(new Date().getTime());
			consultation.setDateConsultation(sqlDate);
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("Rapport du consultation");
			hospitalService.saveConsultation(consultation);
		};
		};*/
	}


