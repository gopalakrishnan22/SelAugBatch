package week2day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		//Step1:: Launch Browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

				//Step2:: Call Java Class to another Class
				//ClassName objName = new ClassName();		
				ChromeDriver driver = new ChromeDriver();		
				
				
				//Load URL
				driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
				
				//driver.findElementById("loginbutton").click();
								
				//String value = "Name";
				Alert alt = driver.switchTo().alert();
				
				/*driver.switchTo().alert().accept();
				
				driver.switchTo().alert().getText();
				
				driver.switchTo().alert().sendKeys("Test");*/
				
				System.out.println(alt.getText());
				
				alt.accept();
				
				driver.findElementById("usernameId").sendKeys("Testleaf");
				
				
				
				
				
				
				
				
				
				
				

	}

}
