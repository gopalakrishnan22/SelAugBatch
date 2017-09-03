package week2day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		WebElement secQues = driver.findElementById("userRegistrationForm:securityQ");
		Select dropDown = new Select(secQues);
		dropDown.selectByVisibleText("What make was your first car or bike?");
		
		
		
		
		
		
		
		
		

	}

}
