package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	
	@Id
	private int hId;
	private String hName;
	private String hType;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Doctor> doctor;

	public Hospital() {
		super();
	}

	public int gethId() {
		return hId;
	}

	public void sethId(int hId) {
		this.hId = hId;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public String gethType() {
		return hType;
	}

	public void sethType(String hType) {
		this.hType = hType;
	}

	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}

	public Hospital(int hId, String hName, String hType, List<Doctor> doctor) {
		super();
		this.hId = hId;
		this.hName = hName;
		this.hType = hType;
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Hospital [hId=" + hId + ", hName=" + hName + ", hType=" + hType + ", doctor=" + doctor + "]";
	}

	
	
	
}
