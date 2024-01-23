package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Doctor {
	
	@Id
	private int drId;
	private String drName;
	private String drSpecialization;
	private Long drMobNo;
	private String drEmail;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Appointment> appointment;

	public Doctor() {
		super();
	}

	public int getDrId() {
		return drId;
	}

	public void setDrId(int drId) {
		this.drId = drId;
	}

	public String getDrName() {
		return drName;
	}

	public void setDrName(String drName) {
		this.drName = drName;
	}

	public String getDrSpecialization() {
		return drSpecialization;
	}

	public void setDrSpecialization(String drSpecialization) {
		this.drSpecialization = drSpecialization;
	}

	public Long getDrMobNo() {
		return drMobNo;
	}

	public void setDrMobNo(Long drMobNo) {
		this.drMobNo = drMobNo;
	}

	public String getDrEmail() {
		return drEmail;
	}

	public void setDrEmail(String drEmail) {
		this.drEmail = drEmail;
	}

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

	public Doctor(int drId, String drName, String drSpecialization, Long drMobNo, String drEmail,
			List<Appointment> appointment) {
		super();
		this.drId = drId;
		this.drName = drName;
		this.drSpecialization = drSpecialization;
		this.drMobNo = drMobNo;
		this.drEmail = drEmail;
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "Doctor [drId=" + drId + ", drName=" + drName + ", drSpecialization=" + drSpecialization + ", drMobNo="
				+ drMobNo + ", drEmail=" + drEmail + ", appointment=" + appointment + "]";
	}

	

}
