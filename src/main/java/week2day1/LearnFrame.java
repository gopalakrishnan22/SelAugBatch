package week2day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {

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
		
		
		
		
		
		
		
		
		
		
		










	}

}
