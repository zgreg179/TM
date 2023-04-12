package com.search.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.search.tm.model.CasefileOwner;

@Repository
public interface CasefileOwnerRepository extends JpaRepository<CasefileOwner, Long> {
    
	public List<CasefileOwner> findByPartyName(String name);
}

