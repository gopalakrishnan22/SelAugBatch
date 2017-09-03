package tests;

import org.junit.Test;

import wrappers.GenericWrappers;

public class Login extends GenericWrappers {

	@Test
	public void createLead() {
	
		//GenericWrappers  = new GenericWrappers();
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username1", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByClassName("decorativeSubmit");
		closeBrowser();
	}

}









