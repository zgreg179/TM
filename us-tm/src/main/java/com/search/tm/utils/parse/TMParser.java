package com.search.tm.utils.parse;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.search.tm.model.Casefile;
import com.search.tm.model.CasefileOwner;
import com.search.tm.model.Country;
import com.search.tm.utils.parse.model.CaseFile;
import com.search.tm.utils.parse.model.CaseFileOwner;

public class TMParser {
    
	 public static List<CaseFile> launch(String xml) {
    	List<CaseFile> cfList = new ArrayList<>();
    	SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
	    try {
	       SAXParser saxParser = saxParserFactory.newSAXParser();
	       TrademarkModelHandler handler = new TrademarkModelHandler();
	       saxParser.parse(new InputSource(new StringReader(xml)), handler);
	       cfList.addAll(handler.getCasefileList());
	    } catch (ParserConfigurationException | SAXException | IOException e) {
	        e.printStackTrace();
	    }
	    return cfList;
    }
	 
	public static void caseFileToEntity(com.search.tm.utils.parse.model.CaseFile src,
			com.search.tm.model.Casefile dest) {
		
		   dest.setSerialNumber(src.getSerialNumber());
	       dest.setRegistrationNumber(src.getRegistrationNumber());
		   dest.setTransactionDate(src.getTransactionDate());
		   if(src != null) {
			   dest.setHdFilingDate(src.getCaseFileHeader().getFilingDate());
			   dest.setHdRegistrationDate(src.getCaseFileHeader().getRegistrationDate());
			   dest.setHdStatusCode(src.getCaseFileHeader().getStatusCode());
			   dest.setHdStatusDate(src.getCaseFileHeader().getStatusDate());
			   dest.setHdMarkIdentification(src.getCaseFileHeader().getMarkIdentification());
			   dest.setHdMarkDrawingCode(src.getCaseFileHeader().getMarkDrawingCode());
			   dest.setHdPublishedForOppositionDate(src.getCaseFileHeader().getPublishedForOppositionDate());
			   dest.setHdAmendToRegisterDate(src.getCaseFileHeader().getAmendToRegisterDate());
			   dest.setHdAbandonmentDate(src.getCaseFileHeader().getAbandonmentDate());
			   dest.setHdCancellationCode(src.getCaseFileHeader().getCancellationCode());
			   dest.setHdCancellationDate(src.getCaseFileHeader().getCancellationCode());
			   dest.setHdRepublished12CDate(src.getCaseFileHeader().getRepublished12CDate());
			   dest.setHdDomesticRepresentativeName(src.getCaseFileHeader().getDomesticRepresentativeName());
			   dest.setHdAttorneyDocketNumber(src.getCaseFileHeader().getAttorneyDocketNumber());
			   dest.setHdAttorneyName(src.getCaseFileHeader().getAttorneyName());
			   dest.setHdPrincipalRegisterAmendedIn(src.getCaseFileHeader().getPrincipalRegisterAmendedIn());
			   dest.setHdSupplementalRegisterAmendedIn(src.getCaseFileHeader().getSupplementalRegisterAmendedIn());
			   dest.setHdTrademarkIn(src.getCaseFileHeader().getTrademarkIn());
			   dest.setHdCollectiveTrademarkIn(src.getCaseFileHeader().getCollectiveTrademarkIn());
			   dest.setHdServiceMarkIn(src.getCaseFileHeader().getServiceMarkIn());
			   dest.setHdCollectiveServiceMarkIn(src.getCaseFileHeader().getCollectiveServiceMarkIn());
			   dest.setHdCollectiveMembershipMarkIn(src.getCaseFileHeader().getCollectiveMembershipMarkIn());
			   dest.setHdCertificationMarkIn(src.getCaseFileHeader().getCertificationMarkIn());
			   dest.setHdCancellationPendingIn(src.getCaseFileHeader().getCancellationPendingIn());
			   dest.setHdPublishedConcurrentIn(src.getCaseFileHeader().getPublishedConcurrentIn());
			   dest.setHdConcurrentUseIn(src.getCaseFileHeader().getConcurrentUseIn());
			   dest.setHdConcurrentUseProceedingIn(src.getCaseFileHeader().getConcurrentUseProceedingIn());
			   dest.setHdInterferencePendingIn(src.getCaseFileHeader().getInterferencePendingIn());
			   dest.setHdOppositionPendingIn(src.getCaseFileHeader().getOppositionPendingIn());
			   dest.setHdSection12CIn(src.getCaseFileHeader().getSection12CIn());
			   dest.setHdSection2FIn(src.getCaseFileHeader().getSection2FIn());
			   dest.setHdSection2FInPartIn(src.getCaseFileHeader().getSection2FIn());
			   dest.setHdRenewalFiledIn(src.getCaseFileHeader().getRenewalFiledIn());
			   dest.setHdSection8FiledIn(src.getCaseFileHeader().getSection8FiledIn());
			   dest.setHdSsection8PartialAcceptIn(src.getCaseFileHeader().getSection8PartialAcceptIn());
			   dest.setHdSection8AcceptedIn(src.getCaseFileHeader().getSection8AcceptedIn());
			   dest.setHdSection15AcknowledgedIn(src.getCaseFileHeader().getSection15AcknowledgedIn());
			   dest.setHdSection15FiledIn(src.getCaseFileHeader().getSection15FiledIn());
			   dest.setHdSupplementalRegisterIn(src.getCaseFileHeader().getSupplementalRegisterIn());
			   dest.setHdForeignPriorityIn(src.getCaseFileHeader().getForeignPriorityIn());
			   dest.setHdChangeRegistrationIn(src.getCaseFileHeader().getChangeRegistrationIn());
			   dest.setHdIntentToUseIn(src.getCaseFileHeader().getIntentToUseIn());
			   dest.setHdIntentToUseCurrentIn(src.getCaseFileHeader().getIntentToUseCurrentIn());
			   dest.setHdFiledAsUseApplicationIn(src.getCaseFileHeader().getFiledAsUseApplicationIn());
			   dest.setHdAmendedToUseApplicationIn(src.getCaseFileHeader().getAmendedToUseApplicationIn());
			   dest.setHdUseApplicationCurrentlyIn(src.getCaseFileHeader().getUseApplicationCurrentlyIn());
			   dest.setHdAmendedToItuApplicationIn(src.getCaseFileHeader().getAmendedToItuApplicationIn());
			   dest.setHdFilingBasisFiledAs44DIn(src.getCaseFileHeader().getFilingBasisFiledAs44DIn());
			   dest.setHdAmendedTo44DApplicationIn(src.getCaseFileHeader().getAmendedTo44DApplicationIn());
			   dest.setHdFilingBasisCurrent44DIn(src.getCaseFileHeader().getFilingBasisCurrent44DIn());
			   dest.setHdFilingBasisFiledAs44EIn(src.getCaseFileHeader().getFilingBasisFiledAs44EIn());
			   dest.setHdFilingBasisCurrent44EIn(src.getCaseFileHeader().getFilingBasisCurrent44EIn());
			   dest.setHdAmendedTo44EApplicationIn(src.getCaseFileHeader().getAmendedTo44EApplicationIn());
			   dest.setHdWithoutBasisCurrentlyIn(src.getCaseFileHeader().getWithoutBasisCurrentlyIn());
			   dest.setHdFilingCurrentNoBasisIn(src.getCaseFileHeader().getFilingCurrentNoBasisIn());
			   dest.setHdColorDrawingFiledIn(src.getCaseFileHeader().getColorDrawingFiledIn());
			   dest.setHdColorDrawingCurrentIn(src.getCaseFileHeader().getColorDrawingCurrentIn());
			   dest.setHdDrawing3DFiledIn(src.getCaseFileHeader().getDrawing3DFiledIn());
			   dest.setHdDrawing3DCurrentIn(src.getCaseFileHeader().getDrawing3DCurrentIn());
			   dest.setHdStandardCharactersClaimedIn(src.getCaseFileHeader().getStandardCharactersClaimedIn());
			   dest.setHdFilingBasisFiledAs66AIn(src.getCaseFileHeader().getFilingBasisFiledAs66AIn());
			   dest.setHdFilingBasisCurrent66AIn(src.getCaseFileHeader().getFilingBasisCurrent66AIn());
			   dest.setHdRenewalDate(src.getCaseFileHeader().getRenewalDate());
			   dest.setHdLawOfficeAssignedLocationCode(src.getCaseFileHeader().getLawOfficeAssignedLocationCode());
			   dest.setHdCurrentLocation(src.getCaseFileHeader().getCurrentLocation());
			   dest.setHdLocationDate(src.getCaseFileHeader().getLocationDate());
			   dest.setHdEmployeeName(src.getCaseFileHeader().getEmployeeName());
		   }
		   
		   if(!src.getCaseFileOwners().isEmpty()) {
			   for(CaseFileOwner owner:src.getCaseFileOwners())
				   dest.getCasefileOwners().add(TMParser.caseFileOwnerToEntity(owner));
		   }
	} 
	
	public static  com.search.tm.model.CasefileOwner caseFileOwnerToEntity(com.search.tm.utils.parse.model.CaseFileOwner src) {
		
			com.search.tm.model.CasefileOwner dest = new com.search.tm.model.CasefileOwner();
			dest.setEntryNumber(src.getEntryNumber());
			dest.setPartyType(src.getPartyType());
			dest.setLegalEntityTypeCode(src.getLegalEntityTypeCode());
			dest.setEntityStatement(src.getEntityStatement());
			dest.setPartyName(src.getPartyName());
			dest.setAddress1(src.getAddress1());
			dest.setAddress2(src.getAddress2());
			dest.setCity(src.getCity());
			dest.setState(src.getState());
			dest.setCountry(Country.valueOf(src.getCountry()));
			dest.setOther(src.getOther());
			dest.setPostcode(src.getPostcode());
			dest.setDbaAkaText(src.getDbaAkaText());
			dest.setComposedOfStatement(src.getComposedOfStatement());
		    return dest;
	}
	
	public static  void updateInstance(Casefile dest, Casefile newInst) {
		
		dest.setSerialNumber(newInst.getSerialNumber());
	       dest.setRegistrationNumber(newInst.getRegistrationNumber());
		   dest.setTransactionDate(newInst.getTransactionDate());
		   if(newInst != null) {
			   dest.setHdFilingDate(newInst.getHdFilingDate());
			   dest.setHdRegistrationDate(newInst.getHdRegistrationDate());
			   dest.setHdStatusCode(newInst.getHdStatusCode());
			   dest.setHdStatusDate(newInst.getHdStatusDate());
			   dest.setHdMarkIdentification(newInst.getHdMarkIdentification());
			   dest.setHdMarkDrawingCode(newInst.getHdMarkDrawingCode());
			   dest.setHdPublishedForOppositionDate(newInst.getHdPublishedForOppositionDate());
			   dest.setHdAmendToRegisterDate(newInst.getHdAmendToRegisterDate());
			   dest.setHdAbandonmentDate(newInst.getHdAbandonmentDate());
			   dest.setHdCancellationCode(newInst.getHdCancellationCode());
			   dest.setHdCancellationDate(newInst.getHdCancellationCode());
			   dest.setHdRepublished12CDate(newInst.getHdRepublished12CDate());
			   dest.setHdDomesticRepresentativeName(newInst.getHdDomesticRepresentativeName());
			   dest.setHdAttorneyDocketNumber(newInst.getHdAttorneyDocketNumber());
			   dest.setHdAttorneyName(newInst.getHdAttorneyName());
			   dest.setHdPrincipalRegisterAmendedIn(newInst.getHdPrincipalRegisterAmendedIn());
			   dest.setHdSupplementalRegisterAmendedIn(newInst.getHdSupplementalRegisterAmendedIn());
			   dest.setHdTrademarkIn(newInst.getHdTrademarkIn());
			   dest.setHdCollectiveTrademarkIn(newInst.getHdCollectiveTrademarkIn());
			   dest.setHdServiceMarkIn(newInst.getHdServiceMarkIn());
			   dest.setHdCollectiveServiceMarkIn(newInst.getHdCollectiveServiceMarkIn());
			   dest.setHdCollectiveMembershipMarkIn(newInst.getHdCollectiveMembershipMarkIn());
			   dest.setHdCertificationMarkIn(newInst.getHdCertificationMarkIn());
			   dest.setHdCancellationPendingIn(newInst.getHdCancellationPendingIn());
			   dest.setHdPublishedConcurrentIn(newInst.getHdPublishedConcurrentIn());
			   dest.setHdConcurrentUseIn(newInst.getHdConcurrentUseIn());
			   dest.setHdConcurrentUseProceedingIn(newInst.getHdConcurrentUseProceedingIn());
			   dest.setHdInterferencePendingIn(newInst.getHdInterferencePendingIn());
			   dest.setHdOppositionPendingIn(newInst.getHdOppositionPendingIn());
			   dest.setHdSection12CIn(newInst.getHdSection12CIn());
			   dest.setHdSection2FIn(newInst.getHdSection2FIn());
			   dest.setHdSection2FInPartIn(newInst.getHdSection2FIn());
			   dest.setHdRenewalFiledIn(newInst.getHdRenewalFiledIn());
			   dest.setHdSection8FiledIn(newInst.getHdSection8FiledIn());
			   dest.setHdSsection8PartialAcceptIn(newInst.getHdSsection8PartialAcceptIn());
			   dest.setHdSection8AcceptedIn(newInst.getHdSection8AcceptedIn());
			   dest.setHdSection15AcknowledgedIn(newInst.getHdSection15AcknowledgedIn());
			   dest.setHdSection15FiledIn(newInst.getHdSection15FiledIn());
			   dest.setHdSupplementalRegisterIn(newInst.getHdSupplementalRegisterIn());
			   dest.setHdForeignPriorityIn(newInst.getHdForeignPriorityIn());
			   dest.setHdChangeRegistrationIn(newInst.getHdChangeRegistrationIn());
			   dest.setHdIntentToUseIn(newInst.getHdIntentToUseIn());
			   dest.setHdIntentToUseCurrentIn(newInst.getHdIntentToUseCurrentIn());
			   dest.setHdFiledAsUseApplicationIn(newInst.getHdFiledAsUseApplicationIn());
			   dest.setHdAmendedToUseApplicationIn(newInst.getHdAmendedToUseApplicationIn());
			   dest.setHdUseApplicationCurrentlyIn(newInst.getHdUseApplicationCurrentlyIn());
			   dest.setHdAmendedToItuApplicationIn(newInst.getHdAmendedToItuApplicationIn());
			   dest.setHdFilingBasisFiledAs44DIn(newInst.getHdFilingBasisFiledAs44DIn());
			   dest.setHdAmendedTo44DApplicationIn(newInst.getHdAmendedTo44DApplicationIn());
			   dest.setHdFilingBasisCurrent44DIn(newInst.getHdFilingBasisCurrent44DIn());
			   dest.setHdFilingBasisFiledAs44EIn(newInst.getHdFilingBasisFiledAs44EIn());
			   dest.setHdFilingBasisCurrent44EIn(newInst.getHdFilingBasisCurrent44EIn());
			   dest.setHdAmendedTo44EApplicationIn(newInst.getHdAmendedTo44EApplicationIn());
			   dest.setHdWithoutBasisCurrentlyIn(newInst.getHdWithoutBasisCurrentlyIn());
			   dest.setHdFilingCurrentNoBasisIn(newInst.getHdFilingCurrentNoBasisIn());
			   dest.setHdColorDrawingFiledIn(newInst.getHdColorDrawingFiledIn());
			   dest.setHdColorDrawingCurrentIn(newInst.getHdColorDrawingCurrentIn());
			   dest.setHdDrawing3DFiledIn(newInst.getHdDrawing3DFiledIn());
			   dest.setHdDrawing3DCurrentIn(newInst.getHdDrawing3DCurrentIn());
			   dest.setHdStandardCharactersClaimedIn(newInst.getHdStandardCharactersClaimedIn());
			   dest.setHdFilingBasisFiledAs66AIn(newInst.getHdFilingBasisFiledAs66AIn());
			   dest.setHdFilingBasisCurrent66AIn(newInst.getHdFilingBasisCurrent66AIn());
			   dest.setHdRenewalDate(newInst.getHdRenewalDate());
			   dest.setHdLawOfficeAssignedLocationCode(newInst.getHdLawOfficeAssignedLocationCode());
			   dest.setHdCurrentLocation(newInst.getHdCurrentLocation());
			   dest.setHdLocationDate(newInst.getHdLocationDate());
			   dest.setHdEmployeeName(newInst.getHdEmployeeName());
		   }
		   
		   if(!newInst.getCasefileOwners().isEmpty()) {
			   for(CasefileOwner owner:newInst.getCasefileOwners())
				   dest.getCasefileOwners().add(owner);
		   }
		
    }
}
