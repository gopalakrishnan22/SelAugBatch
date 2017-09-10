package testsCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MethodsParallel {

	@Test
	public void learnAlert(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementById("loginbutton").click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		driver.findElementById("usernameId").sendKeys("Testleaf");
		driver.close();
	}
	
	@Test
	public void learnFrame(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();		
		WebElement demo = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(demo);
		driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();		
		driver.findElementByLinkText("Download").click();
		driver.close();
	}
}
