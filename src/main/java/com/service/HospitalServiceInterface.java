package com.service;

import com.model.Hospital;

public interface HospitalServiceInterface {
	
	public Hospital saveHospital(Hospital hospital);
	
    public Hospital getOneHospital(int hospitalId);
    
    public void deleteById(int hospitalId);
    
	public Hospital updateHospital(Hospital h);



}
