//package com.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.model.Doctor;
//import com.service.doctorServiceInterface;
//
//@RestController
//@CrossOrigin(origins="https://localhost:4200")
//@RequestMapping("doctor")
//public class DoctorController {
//
//	@Autowired
//	doctorServiceInterface doctorService;
//	
//	
//	
//	@PostMapping("/save")
//	public Doctor saveDoctor(Doctor d) {
//		doctorService.saveDoctor(d);
//		return d;
//	}
//}
