package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.AdminRepository;
import com.model.Admin;

@Service
public class AdminServiceImple implements AdminServiceInterface {

	@Autowired
	AdminRepository admRepo;

	@Override
	public Admin saveAdmin(Admin ad) {
		
		return admRepo.save(ad);
	}

	@Override
	public Admin getOneAdmin(int adminId) {
		
		return admRepo.findById(adminId).orElse(null);
	}

	@Override
	public void deleteById(int adminId) {
		admRepo.deleteById(adminId);
		
	}

	@Override
	public Admin updateAdmin(Admin ad) {
		Admin existAdmin=admRepo.findById(ad.getAdId()).orElse(null);
		existAdmin.setAdminName(ad.getAdminName());;
		return admRepo.save(existAdmin);
	}

	
	


}
