package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Admin;
import com.service.AdminServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class AdminController {
	
	@Autowired
	AdminServiceInterface admServ;
	
	@PostMapping("addadmin")
	public Admin addAdmin(@RequestBody Admin a) 
	{
		admServ.saveAdmin(a);
		return a;
	}
	
	@GetMapping("/getAdmin/{id}")
	public Admin getOneAdmin(@PathVariable int id) 
	{
		
		return admServ.getOneAdmin(id);
	}
	
	@GetMapping("deleteAdmin/{id}")
	public void deleteById(@PathVariable int id)
	{
		admServ.deleteById(id);
	}
	
	@PutMapping("updateAdmin")
	public Admin updateAdmin(@RequestBody Admin ad) 
	{
		return admServ.updateAdmin(ad);
	}

}

