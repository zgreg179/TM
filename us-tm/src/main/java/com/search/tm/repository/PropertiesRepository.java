package com.search.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.search.tm.model.Property;

@Repository
public interface PropertiesRepository extends JpaRepository<Property, Long> {
    
}

