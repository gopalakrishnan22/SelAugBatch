package week3Day1;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://legacy.crystalcruises.com/Calendar.aspx");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> allQuote =  driver.findElementsByLinkText("Get-a-Quote1");
		
		int count = allQuote.size();
	
		System.out.println(count);		
		
		/*allQuote.get(2).click();
		
		System.out.println(driver.getCurrentUrl());*/
		
		
		
		
		
		
		
		
		
		
		
		










	}

}
