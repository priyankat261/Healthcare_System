package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital ,Integer>{

}
