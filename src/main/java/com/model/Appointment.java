package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Appointment
{
	
	@Id
	private int appId;
	private Date appDate;
	
	public Appointment() {
		super();
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public Date getAppDate() {
		return appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public Appointment(int appId, Date appDate) {
		super();
		this.appId = appId;
		this.appDate = appDate;
	}

	@Override
	public String toString() {
		return "Appointment [appId=" + appId + ", appDate=" + appDate + "]";
	}
	
	

}
