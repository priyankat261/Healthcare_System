package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.PatientRepository;
import com.model.Patient;


@Service
public class PatientServiceImple implements PatientServiceInterface {

	
	@Autowired 
	PatientRepository patientRepo;

	@Override
	public Patient savePatient(Patient pat) {
		patientRepo.save(pat);
		return  pat;
	}

	@Override
	public Patient getOnePatient(int patientId) {
		
		return patientRepo.findById(patientId).orElse(null);
	}

	@Override
	public void deleteById(int patientId) {
		patientRepo.deleteById(patientId);
		
	}

	@Override
	public Patient updatePatient(Patient pat) {
		Patient existPatient=patientRepo.findById(pat.getPatId()).orElse(null);
		existPatient.setPatName(pat.getPatName());;
		return patientRepo.save(existPatient);
	}

	@Override
	public List<Patient> getAllPatient() {
		
		return patientRepo.findAll();
	}

//	@Override
//	public List<Patient> saveAll(List<Patient> patlist) {
//
//		return patientRepo.saveAll(patlist);
//	}

	

	
}