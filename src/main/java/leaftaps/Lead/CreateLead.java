package leaftaps.Lead;





import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrapper;

public class CreateLead extends ProjectSpecificWrapper{
	
	@Test(dataProvider="fetchData")
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
	
	@DataProvider(name = "fetchData")
	public Object[][] getData(){
		Object[][] data = new Object[2][3];
		data[0][0] = "Testleaf";
		data[0][1] = "Sethu";
		data[0][2] = "S";
		data[1][0] = "QEagle";
		data[1][1] = "Sharath";
		data[1][2] = "M";
		return data;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}









