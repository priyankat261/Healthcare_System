package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	
	@Id
	private int adId;
	private String adminName;
	private Long adminContact;
	private String adminEmail;
	private String adminPassword;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Patient> patient;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Hospital> hospital;

	public Admin() {
		super();
	}

	public int getAdId() {
		return adId;
	}

	public void setAdId(int adId) {
		this.adId = adId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public Long getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(Long adminContact) {
		this.adminContact = adminContact;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	public List<Hospital> getHospital() {
		return hospital;
	}

	public void setHospital(List<Hospital> hospital) {
		this.hospital = hospital;
	}

	public Admin(int adId, String adminName, Long adminContact, String adminEmail, String adminPassword,
			List<Patient> patient, List<Hospital> hospital) {
		super();
		this.adId = adId;
		this.adminName = adminName;
		this.adminContact = adminContact;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
		this.patient = patient;
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "Admin [adId=" + adId + ", adminName=" + adminName + ", adminContact=" + adminContact + ", adminEmail="
				+ adminEmail + ", adminPassword=" + adminPassword + ", patient=" + patient + ", hospital=" + hospital
				+ "]";
	}

	
	
	

}
