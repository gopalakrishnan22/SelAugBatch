package week1Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindLead {

	public static void main(String[] args) {
		
		//Step1:: Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		//Step2:: Call Java Class to another Class
		//ClassName objName = new ClassName();		
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize
		driver.manage().window().maximize();
		
		//Step 4:: Enter the UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Step 5:: Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Step 6:: Click the Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		
	
	}

}









