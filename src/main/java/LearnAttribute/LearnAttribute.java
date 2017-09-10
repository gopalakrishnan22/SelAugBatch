package LearnAttribute;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnAttribute {
	
	//@Test(invocationCount = 2)
	@Test(invocationCount = 2, threadPoolSize = 3)
	//@Test(invocationCount = 2, threadPoolSize = 3, invocationTimeOut = 15000)
	//@Test(invocationCount = 2, invocationTimeOut = 15000)
	//@Test(invocationCount = 2, timeOut = 15000)
	public void sample(){
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();		
		WebElement demo = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(demo);
		driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
		driver.switchTo().defaultContent();	
		driver.findElementByLinkText("Download").click();		
		driver.close();
	}

}
