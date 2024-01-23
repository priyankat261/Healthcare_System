package com.service;

import com.model.Admin;

public interface AdminServiceInterface {
	
	public Admin saveAdmin(Admin ad);
	
    public Admin getOneAdmin(int adminId);
    
	public void deleteById(int adminId);
	
	public Admin updateAdmin(Admin ad);


	
	
	
}
	
