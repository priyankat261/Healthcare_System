package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.HospitalRepository;
import com.model.Hospital;

@Service
public class HospitalServiceImple implements HospitalServiceInterface{

	@Autowired
	HospitalRepository hosRepo;
	
	@Override
	public Hospital saveHospital(Hospital hospital) {
		
		return hosRepo.save(hospital);
	}

	@Override
	public Hospital getOneHospital(int hospitalId) {
		// TODO Auto-generated method stub
		return hosRepo.findById(hospitalId).orElse(null);
	}

	@Override
	public void deleteById(int hospitalId) {
		hosRepo.deleteById(hospitalId);
		
	}

	@Override
	public Hospital updateHospital(Hospital h) {
		Hospital existHospital=hosRepo.findById(h.gethId()).orElse(null);
		existHospital.sethName(h.gethName());;
		return hosRepo.save(existHospital);
	}

	

	
}
