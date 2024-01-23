package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.model.Hospital;
import com.service.HospitalServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class HospitalController {

	@Autowired
	HospitalServiceInterface hosServ;
	
	@PostMapping("addhospital")
	public Hospital addHospital(@RequestBody Hospital hospital) 
	{
		hosServ.saveHospital(hospital);
		return hospital;
	}
	

	@GetMapping("/getHospital/{id}")
	public Hospital getOneHospital(@PathVariable int id) 
	{
		
		return hosServ.getOneHospital(id);
	}
	
	@GetMapping("deleteHospital/{id}")
	public void deleteById(@PathVariable int id)
	{
		hosServ.deleteById(id);
	}
	
	@PutMapping("updateHospital")
	public Hospital updateHospital(@RequestBody Hospital h) 
	{
		return hosServ.updateHospital(h);
	}
}
