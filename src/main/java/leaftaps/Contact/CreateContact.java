package leaftaps.Contact;

import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrapper;

public class CreateContact extends ProjectSpecificWrapper {

	@Test(groups = {"smoke"})
	public void  createContact() throws Exception {
		clickByLink("Contacts");
		clickByLink("Create Contact");
		enterById("firstNameField", "Gopinath");
		enterById("lastNameField", "Jayakumar");
		clickByName("submitButton");
	}	
}
