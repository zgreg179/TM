package com.search.tm.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.search.tm.utils.parse.model.CaseFile;
import com.search.tm.utils.parse.model.CaseFileEventStatements;
import com.search.tm.utils.parse.model.CaseFileHeader;
import com.search.tm.utils.parse.model.CaseFileOwners;
import com.search.tm.utils.parse.model.CaseFileStatements;
import com.search.tm.utils.parse.model.Classifications;
import com.search.tm.utils.parse.model.Correspondent;
import com.search.tm.utils.parse.model.DesignSearches;
import com.search.tm.utils.parse.model.ForeignApplications;
import com.search.tm.utils.parse.model.InternationalRegistration;
import com.search.tm.utils.parse.model.MadridInternationalFilingRequests;
import com.search.tm.utils.parse.model.PriorRegistrationApplications;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class CasefileOwner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	   
	@Column
    private String entryNumber;
    
	@Column
    private String partyType;
    
	@Column
    private String legalEntityTypeCode;
    
	@Column
    private String entityStatement;
    
	@Column
    private String partyName;
    
	@Column
    private String address1;
    
	@Column
    private String address2;
    
	@Column
    private String city;
    
	@Column
    private String state;
    
	@Enumerated
	@Column
    private Country country;
    
	@Column
    private String other;
    
	@Column
    private String postcode;
    
	@Column
    private String dbaAkaText;
    
	@Column
    private String composedOfStatement;
    
	@Column
    private String nameChangeExplanation;
        
    @ManyToOne()
    @JoinColumn(name = "casefile_id")
    private Casefile casefile;
    
}