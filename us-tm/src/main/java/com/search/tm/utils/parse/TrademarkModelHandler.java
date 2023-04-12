package com.search.tm.utils.parse;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.search.tm.utils.parse.model.CaseFile;
import com.search.tm.utils.parse.model.CaseFileHeader;
import com.search.tm.utils.parse.model.CaseFileOwner;;

public class TrademarkModelHandler extends DefaultHandler {

		// List to hold CaseFile object
		private List<CaseFile> cfList = new ArrayList<>();
	    private CaseFile caseFile = null;
		private StringBuilder data = null;
		private CaseFileOwner caseFileOwner = null;

		public List<CaseFile> getCasefileList() {
			return this.cfList;
		}
				
		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			
			//System.out.println("Start === "+localName+" == "+qName);
			if (qName.equalsIgnoreCase("case-file")) 
				this.caseFile = new CaseFile();
			else if (qName.equalsIgnoreCase("case-file-header")) 
				this.caseFile.setCaseFileHeader(new CaseFileHeader());
			else if (qName.equalsIgnoreCase("case-file-owner")) { 
				this.caseFileOwner = new CaseFileOwner();  
				this.caseFile.getCaseFileOwners();
			}
		}

		@Override
		public void endElement(String uri, String localName, String qName) throws SAXException {
		
		    if(qName.equalsIgnoreCase("serial-number")) 
				this.caseFile.setSerialNumber(data.toString());
		    else if(qName.equalsIgnoreCase("registration-number")) 
				this.caseFile.setRegistrationNumber(data.toString());
			else if(qName.equalsIgnoreCase("transaction-date")) 
				this.caseFile.setTransactionDate(data.toString());
			else if(qName.equalsIgnoreCase("registration-date")) 
				this.caseFile.getCaseFileHeader().setRegistrationDate(data.toString());
			else if(qName.equalsIgnoreCase("status-code")) 
				this.caseFile.getCaseFileHeader().setStatusCode(data.toString());
			else if(qName.equalsIgnoreCase("status-date")) 
				this.caseFile.getCaseFileHeader().setStatusDate(data.toString());
			else if(qName.equalsIgnoreCase("mark-drawing-code")) 
				this.caseFile.getCaseFileHeader().setMarkDrawingCode(data.toString());
			else if(qName.equalsIgnoreCase("principal-register-amended-in")) 
				this.caseFile.getCaseFileHeader().setPrincipalRegisterAmendedIn(data.toString());
			else if(qName.equalsIgnoreCase("registration-date")) 
				this.caseFile.getCaseFileHeader().setRegistrationDate(data.toString());
			else if(qName.equalsIgnoreCase("registration-date")) 
				this.caseFile.getCaseFileHeader().setRegistrationDate(data.toString());
			else if(qName.equalsIgnoreCase("registration-date")) 
				this.caseFile.getCaseFileHeader().setRegistrationDate(data.toString());
			else if(qName.equalsIgnoreCase("registration-date")) 
				this.caseFile.getCaseFileHeader().setRegistrationDate(data.toString());
			else if(qName.equalsIgnoreCase("principal-register-amended-in")) 
				 this.caseFile.getCaseFileHeader().setPrincipalRegisterAmendedIn(data.toString());
			else if(qName.equalsIgnoreCase("supplemental-register-amended-in"))
			 this.caseFile.getCaseFileHeader().setPrincipalRegisterAmendedIn(data.toString());		
			else if(qName.equalsIgnoreCase("trademark-in"))
			 this.caseFile.getCaseFileHeader().setTrademarkIn(data.toString());
			else if(qName.equalsIgnoreCase("collective-trademark-in"))
			 this.caseFile.getCaseFileHeader().setCollectiveTrademarkIn(data.toString());
			else if(qName.equalsIgnoreCase("service-mark-in"))
			 this.caseFile.getCaseFileHeader().setServiceMarkIn(data.toString());
			else if(qName.equalsIgnoreCase("collective-service-mark-in"))
			 this.caseFile.getCaseFileHeader().setCollectiveServiceMarkIn(data.toString());
			else if(qName.equalsIgnoreCase("collective-membership-mark-in"))
			 this.caseFile.getCaseFileHeader().setCollectiveMembershipMarkIn(data.toString());
			else if(qName.equalsIgnoreCase("certification-mark-in"))
			 this.caseFile.getCaseFileHeader().setCertificationMarkIn(data.toString());
			else if(qName.equalsIgnoreCase("cancellation-pending-in"))
			 this.caseFile.getCaseFileHeader().setCancellationPendingIn(data.toString());
			else if(qName.equalsIgnoreCase("published-concurrent-in"))
			 this.caseFile.getCaseFileHeader().setPublishedConcurrentIn(data.toString());
			else if(qName.equalsIgnoreCase("concurrent-use-in"))
			 this.caseFile.getCaseFileHeader().setConcurrentUseIn(data.toString());
			else if(qName.equalsIgnoreCase("concurrent-use-proceeding-in"))
			 this.caseFile.getCaseFileHeader().setConcurrentUseProceedingIn(data.toString());
			else if(qName.equalsIgnoreCase("interference-pending-in"))
			 this.caseFile.getCaseFileHeader().setInterferencePendingIn(data.toString());
			else if(qName.equalsIgnoreCase("opposition-pending-in"))
			 this.caseFile.getCaseFileHeader().setOppositionPendingIn(data.toString());
			else if(qName.equalsIgnoreCase("section-12c-in"))
			 this.caseFile.getCaseFileHeader().setSection12CIn(data.toString());
			else if(qName.equalsIgnoreCase("section-2f-in"))
			 this.caseFile.getCaseFileHeader().setSection2FIn(data.toString());
			else if(qName.equalsIgnoreCase("section-2f-in-part-in"))
			 this.caseFile.getCaseFileHeader().setSection2FInPartIn(data.toString());
			else if(qName.equalsIgnoreCase("renewal-filed-in"))
			 this.caseFile.getCaseFileHeader().setRenewalFiledIn(data.toString());
			else if(qName.equalsIgnoreCase("section-8-filed-in"))
			 this.caseFile.getCaseFileHeader().setSection8FiledIn(data.toString());
			else if(qName.equalsIgnoreCase("section-8-partial-accept-in"))
			 this.caseFile.getCaseFileHeader().setSection8PartialAcceptIn(data.toString());
			else if(qName.equalsIgnoreCase("section-8-accepted-in"))
			 this.caseFile.getCaseFileHeader().setSection8AcceptedIn(data.toString());
			else if(qName.equalsIgnoreCase("section-15-acknowledged-in"))
			 this.caseFile.getCaseFileHeader().setSection15AcknowledgedIn(data.toString());
			else if(qName.equalsIgnoreCase("section-15-filed-in"))
			 this.caseFile.getCaseFileHeader().setSection15FiledIn(data.toString());
			else if(qName.equalsIgnoreCase("supplemental-register-in"))
			 this.caseFile.getCaseFileHeader().setSupplementalRegisterIn(data.toString());
			else if(qName.equalsIgnoreCase("foreign-priority-in"))
			 this.caseFile.getCaseFileHeader().setForeignPriorityIn(data.toString());
			else if(qName.equalsIgnoreCase("change-registration-in"))
			 this.caseFile.getCaseFileHeader().setChangeRegistrationIn(data.toString());
			else if(qName.equalsIgnoreCase("intent-to-use-in"))
			 this.caseFile.getCaseFileHeader().setIntentToUseIn(data.toString());
			else if(qName.equalsIgnoreCase("intent-to-use-current-in"))
			 this.caseFile.getCaseFileHeader().setIntentToUseCurrentIn(data.toString());
			else if(qName.equalsIgnoreCase("filed-as-use-application-in"))
			 this.caseFile.getCaseFileHeader().setFiledAsUseApplicationIn(data.toString());
			else if(qName.equalsIgnoreCase("amended-to-use-application-in"))
			 this.caseFile.getCaseFileHeader().setAmendedToUseApplicationIn(data.toString());
			else if(qName.equalsIgnoreCase("use-application-currently-in"))
			 this.caseFile.getCaseFileHeader().setUseApplicationCurrentlyIn(data.toString());
			else if(qName.equalsIgnoreCase("amended-to-itu-application-in"))
			 this.caseFile.getCaseFileHeader().setAmendedToItuApplicationIn(data.toString());
			else if(qName.equalsIgnoreCase("filing-basis-filed-as-44d-in"))
			 this.caseFile.getCaseFileHeader().setFilingBasisFiledAs44DIn(data.toString());
			else if(qName.equalsIgnoreCase("amended-to-44d-application-in"))
			 this.caseFile.getCaseFileHeader().setAmendedTo44DApplicationIn(data.toString());
			else if(qName.equalsIgnoreCase("filing-basis-current-44d-in"))
			 this.caseFile.getCaseFileHeader().setFilingBasisCurrent44DIn(data.toString());
			else if(qName.equalsIgnoreCase("filing-basis-filed-as-44e-in"))
			 this.caseFile.getCaseFileHeader().setFilingBasisFiledAs44EIn(data.toString());
			else if(qName.equalsIgnoreCase("filing-basis-current-44e-in"))
			 this.caseFile.getCaseFileHeader().setFilingBasisCurrent44EIn(data.toString());
			else if(qName.equalsIgnoreCase("amended-to-44e-application-in"))
			 this.caseFile.getCaseFileHeader().setAmendedTo44EApplicationIn(data.toString());
			else if(qName.equalsIgnoreCase("without-basis-currently-in"))
			 this.caseFile.getCaseFileHeader().setWithoutBasisCurrentlyIn(data.toString());
			else if(qName.equalsIgnoreCase("filing-current-no-basis-in"))
			 this.caseFile.getCaseFileHeader().setFilingCurrentNoBasisIn(data.toString());
			else if(qName.equalsIgnoreCase("color-drawing-filed-in"))
			 this.caseFile.getCaseFileHeader().setColorDrawingFiledIn(data.toString());
			else if(qName.equalsIgnoreCase("color-drawing-current-in"))
			 this.caseFile.getCaseFileHeader().setColorDrawingCurrentIn(data.toString());
			else if(qName.equalsIgnoreCase("drawing-3d-filed-in"))
			 this.caseFile.getCaseFileHeader().setDrawing3DFiledIn(data.toString());
			else if(qName.equalsIgnoreCase("drawing-3d-current-in"))
			 this.caseFile.getCaseFileHeader().setDrawing3DCurrentIn(data.toString());
			else if(qName.equalsIgnoreCase("standard-characters-claimed-in"))
			 this.caseFile.getCaseFileHeader().setStandardCharactersClaimedIn(data.toString());
			else if(qName.equalsIgnoreCase("filing-basis-filed-as-66a-in"))
			 this.caseFile.getCaseFileHeader().setFilingBasisFiledAs66AIn(data.toString());
			else if(qName.equalsIgnoreCase("filing-basis-current-66a-in"))
			 this.caseFile.getCaseFileHeader().setFilingBasisCurrent66AIn(data.toString());
			else if(qName.equalsIgnoreCase("entry-number"))
				this.caseFileOwner.setEntryNumber(data.toString());
			else if(qName.equalsIgnoreCase("party-type"))
				this.caseFileOwner.setPartyType(data.toString());
			else if(qName.equalsIgnoreCase("legal-entity-type-Code"))
				this.caseFileOwner.setLegalEntityTypeCode(data.toString());
			else if(qName.equalsIgnoreCase("entity-statement"))
				this.caseFileOwner.setEntityStatement(data.toString());
			else if(qName.equalsIgnoreCase("party-name"))
				this.caseFileOwner.setPartyName(data.toString());
			else if(qName.equalsIgnoreCase("address1"))
				this.caseFileOwner.setAddress1(data.toString());
			else if(qName.equalsIgnoreCase("address2"))
				this.caseFileOwner.setAddress2(data.toString());
			else if(qName.equalsIgnoreCase("city"))
				this.caseFileOwner.setCity(data.toString());
			else if(qName.equalsIgnoreCase("state"))
				this.caseFileOwner.setState(data.toString());
			else if(qName.equalsIgnoreCase("country"))
				this.caseFileOwner.setCountry(data.toString());
			else if(qName.equalsIgnoreCase("other"))
				this.caseFileOwner.setOther(data.toString());
			else if(qName.equalsIgnoreCase("postcode"))
				this.caseFileOwner.setPostcode(data.toString());
			else if(qName.equalsIgnoreCase("dba-aka-text"))
				this.caseFileOwner.setDbaAkaText(data.toString());
			else if(qName.equalsIgnoreCase("composed-of-statement"))
				this.caseFileOwner.setComposedOfStatement(data.toString());
						
			if (qName.equalsIgnoreCase("case-file")) 
				this.cfList.add(this.caseFile);
			else if (qName.equalsIgnoreCase("case-file-owner")) 
				this.caseFile.getCaseFileOwners().add(this.caseFileOwner);
		}

		@Override
		public void characters(char ch[], int start, int length) throws SAXException {
			if (data == null) {
	            data = new StringBuilder();
	        } else {
	        	data.delete(0, data.length());
	        	data.append(new String(ch, start, length));
			}
		}
}
	

