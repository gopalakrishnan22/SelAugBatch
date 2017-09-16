package leaftaps.Lead;





import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrapper;

public class CreateLead extends ProjectSpecificWrapper{
	
	@Test(dataProvider="fetchData",dataProviderClass=Week5Day1.DP.class)
	public void createLead(String compName, String fName, String lName) throws Exception{	
		clickByLink("Leads");
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",compName);
		enterById("createLeadForm_firstName", fName);
		enterById("createLeadForm_lastName", lName);		
		enterById("createLeadForm_primaryEmail", "gopinath@testleaf.com");
		enterById("createLeadForm_primaryPhoneNumber", "9597704568");
		clickByName("submitButton");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}









