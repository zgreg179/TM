package com.search.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.search.tm.model.Casefile;


@Repository
public interface CasefileRepository extends JpaRepository<Casefile, Long> {
    
	Casefile findBySerialNumber(String number);
	Casefile findByRegistrationNumber(String number);
}

