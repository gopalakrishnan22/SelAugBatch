package week1.day1;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
	//	WebDriver
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
		driver.findElementByClassName("decorativeSubmit1").click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		NoSuchElementException
		
		//Step 7:: Click the LogOut Button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Step 8:: Close Browser.
		driver.close();
	}

}









