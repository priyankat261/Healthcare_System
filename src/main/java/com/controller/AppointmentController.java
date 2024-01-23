//package com.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.model.Appointment;
//import com.service.appointmentServiceInterface;
//
//@RestController
//@CrossOrigin(origins="https://localhost:4200")
//@RequestMapping("Appointment")
//public class AppointmentController {
//	
//
//	@Autowired
//	appointmentServiceInterface appointService;
//	
//	
//	
//	@PostMapping("/save")
//	public Appointment saveappointment(Appointment appoint) {
//		appointService.saveappointment(appoint);
//		return appoint;
//		
//	}
//
//}
////
