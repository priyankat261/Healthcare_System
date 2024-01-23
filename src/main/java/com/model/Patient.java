package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Patient{
	

	@Id
	private int patId;
    private String patName;
	private String bloodGroup; 
    private String patGender;
    private String patemail;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Disease> disease;

	public Patient() {
		super();
	}

	public int getPatId() {
		return patId;
	}

	public void setPatId(int patId) {
		this.patId = patId;
	}

	public String getPatName() {
		return patName;
	}

	public void setPatName(String patName) {
		this.patName = patName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getPatGender() {
		return patGender;
	}

	public void setPatGender(String patGender) {
		this.patGender = patGender;
	}

	public String getPatemail() {
		return patemail;
	}

	public void setPatemail(String patemail) {
		this.patemail = patemail;
	}

	public List<Disease> getDisease() {
		return disease;
	}

	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "Patient [patId=" + patId + ", patName=" + patName + ", bloodGroup=" + bloodGroup + ", patGender="
				+ patGender + ", patemail=" + patemail + ", disease=" + disease + "]";
	}

	
	
    
}