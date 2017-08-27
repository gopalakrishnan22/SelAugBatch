package week2day1;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowsAndSnapshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://legacy.crystalcruises.com/");
		driver.manage().window().maximize();		
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Set<String> allWin  = driver.getWindowHandles();
		System.out.println(allWin.size());
		
		//Last Window
		for (String eachWin : allWin) {
			driver.switchTo().window(eachWin);	
		}		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img1.jpg");
		FileUtils.copyFile(src, desc);
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		










	}

}
