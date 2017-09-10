package testsCases;

import org.junit.Test;

import wrappers.GenericWrappers;
import wrappers.ProjectSpecificWrapper;

public class Login extends ProjectSpecificWrapper {

	public void creatLead() throws Exception {
		ProjectSpecificWrapper ps = new ProjectSpecificWrapper();
		
	//	ps.login();
		ps.clickByLink("Leads");
	}
	

}









