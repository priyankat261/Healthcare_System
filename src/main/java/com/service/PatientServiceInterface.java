package com.service;

import java.util.List;

import com.model.Patient;

public interface PatientServiceInterface {

   public Patient savePatient(Patient pat);
   
//   public List<Patient> saveAll(List<Patient> patlist);
   
   public Patient getOnePatient(int patientId);
   
   public List<Patient> getAllPatient();
   
	public void deleteById(int patientId);
	
	public Patient updatePatient(Patient pat);



	
}
