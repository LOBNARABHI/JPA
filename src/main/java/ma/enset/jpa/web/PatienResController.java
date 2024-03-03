package ma.enset.jpa.web;

import ma.enset.jpa.entities.Patient;
import ma.enset.jpa.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PatienResController {
    @Autowired
    private PatientRepository patientRepository;
    @GetMapping("/Patients")
    public List<Patient> patientList(){
        return  patientRepository.findAll();
    }

}
