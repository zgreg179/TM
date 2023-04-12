package com.search.tm.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Casefile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;
	   
	@Column
	private String serialNumber;
    
	@Column
    private String registrationNumber;
    
    @Column
    private String transactionDate;
   
    @Column
    private String hdFilingDate;
    
    @Column
    private String hdRegistrationDate;
    
    @Column
    private String hdStatusCode;
    
    @Column
    private String hdStatusDate;
    
    @Column
    private String hdMarkIdentification;
    
    @Column
    private String hdMarkDrawingCode;
    
    @Column
    private String hdPublishedForOppositionDate;
    @Column
    private String hdAmendToRegisterDate;
    
    @Column
    private String hdAbandonmentDate;
    
    @Column
    private String hdCancellationCode;
    
    @Column
    private String hdCancellationDate;
    
    @Column
    private String hdRepublished12CDate;
    
    @Column
    private String hdDomesticRepresentativeName;
    
    @Column
    private String hdAttorneyDocketNumber;
    
    @Column
    private String hdAttorneyName;
    
    @Column
    private String hdPrincipalRegisterAmendedIn;
    
    @Column
    private String hdSupplementalRegisterAmendedIn;
    
    @Column
    private String hdTrademarkIn;
    
    @Column
    private String hdCollectiveTrademarkIn;
    
    @Column
    private String hdServiceMarkIn;
    
    @Column
    private String hdCollectiveServiceMarkIn;
    
    @Column
    private String hdCollectiveMembershipMarkIn;
    
    @Column
    private String hdCertificationMarkIn;
    
    @Column
    private String hdCancellationPendingIn;
    
    @Column
    private String hdPublishedConcurrentIn;
    
    @Column
    private String hdConcurrentUseIn;
    
    @Column
    private String hdConcurrentUseProceedingIn;
    
    @Column
    private String hdInterferencePendingIn;
    
    @Column
    private String hdOppositionPendingIn;
    
    @Column
    private String hdSection12CIn;
    
    @Column
    private String hdSection2FIn;
    
    @Column
    private String hdSection2FInPartIn;
    
    @Column
    private String hdRenewalFiledIn;
    
    @Column
    private String hdSection8FiledIn;
    
    @Column
    private String hdSsection8PartialAcceptIn;
    
    @Column
    private String hdSection8AcceptedIn;
    
    @Column
    private String hdSection15AcknowledgedIn;
    
    @Column
    private String hdSection15FiledIn;
    
    @Column
    private String hdSupplementalRegisterIn;
    
    @Column
    private String hdForeignPriorityIn;
    
    @Column
    private String hdChangeRegistrationIn;
    
    @Column
    private String hdIntentToUseIn;
    
    @Column
    private String hdIntentToUseCurrentIn;
    
    @Column
    private String hdFiledAsUseApplicationIn;
    
    @Column
    private String hdAmendedToUseApplicationIn;
    
    @Column
    private String hdUseApplicationCurrentlyIn;
    
    @Column
    private String hdAmendedToItuApplicationIn;
    
    @Column
    private String hdFilingBasisFiledAs44DIn;
    
    @Column
    private String hdAmendedTo44DApplicationIn;
    
    @Column
    private String hdFilingBasisCurrent44DIn;
    
    @Column
    private String hdFilingBasisFiledAs44EIn;
    
    @Column
    private String hdFilingBasisCurrent44EIn;
    
    @Column
    private String hdAmendedTo44EApplicationIn;
    
    @Column
    private String hdWithoutBasisCurrentlyIn;
    
    @Column
    private String hdFilingCurrentNoBasisIn;
    
    @Column
    private String hdColorDrawingFiledIn;
    
    @Column
    private String hdColorDrawingCurrentIn;
    
    @Column
    private String hdDrawing3DFiledIn;
    
    @Column
    private String hdDrawing3DCurrentIn;
    
    @Column
    private String hdStandardCharactersClaimedIn;
    
    @Column
    private String hdFilingBasisFiledAs66AIn;
    
    @Column
    private String hdFilingBasisCurrent66AIn;
    
    @Column
    private String hdRenewalDate;
    
    @Column
    private String hdLawOfficeAssignedLocationCode;
    
    @Column
    private String hdCurrentLocation;
    
    @Column
    private String hdLocationDate;
    
    @Column
    private String hdEmployeeName;
        
    @OneToMany(mappedBy="casefile")
    private List<CasefileOwner> casefileOwners = new ArrayList<>();
    
}