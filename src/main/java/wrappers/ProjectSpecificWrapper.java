package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper extends GenericWrappers {
	
	@Parameters({"browserName","URL","userName","password"})
	@BeforeMethod(groups ={"Common"})
	public void login(String browserName, String url, String uName, String pwd) throws Exception {
		invokeApp(browserName, url);
		enterById("username", uName);
		enterById("password", pwd);
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");		
	}
	
	/*@BeforeMethod
	public void login() throws Exception{
		invokeApp("chrome", "http://192.168.1.17");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	}*/
	
	@AfterMethod(groups ={"Common"})
	public void closeApp(){
		quitBrowser();
	}
	
	
	
	
	
	
	
	
	
	
}
