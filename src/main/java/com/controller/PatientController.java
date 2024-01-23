package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Patient;
import com.service.PatientServiceInterface;


@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class PatientController {
	
	

	    @Autowired
	    PatientServiceInterface patientService;
		
		@PostMapping("/save")
		public Patient addPatient(@RequestBody Patient p) {
			patientService.savePatient(p);
			return p;
		}
		
//		@PostMapping("saveallpatients")
//		public List<Patient> saveAll(@RequestBody List<Patient> list) 
//		{
//			
//			return patientService.saveAll(list);
//		}

		@GetMapping("/getPatient/{id}")
		public Patient getOnePatient(@PathVariable int id) 
		{
			
			return patientService.getOnePatient(id);
		}
		
		@GetMapping("/getAllPatient")
		public List<Patient> findAllPatient() {
			return patientService.getAllPatient();
		}
		
		@GetMapping("deletePatient/{id}")
		public void deleteById(@PathVariable int id)
		{
			patientService.deleteById(id);
		}
		
		@PutMapping("updatePatient")
		public Patient updatePatient(@RequestBody Patient pat) 
		{
			return patientService.updatePatient(pat);
		}
		
		

}
