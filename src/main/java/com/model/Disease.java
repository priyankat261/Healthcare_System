package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disease {
	
	 @Id
	 private Long dId;
     private String dName;
     private String dType;
     private String symptoms;
	
     public Disease() {
		super();
	}

	public Long getdId() {
		return dId;
	}

	public void setdId(Long dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdType() {
		return dType;
	}

	public void setdType(String dType) {
		this.dType = dType;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public Disease(Long dId, String dName, String dType, String symptoms) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dType = dType;
		this.symptoms = symptoms;
	}

	@Override
	public String toString() {
		return "Disease [dId=" + dId + ", dName=" + dName + ", dType=" + dType + ", symptoms=" + symptoms + "]";
	}
     
     

	

}
