package week2day1;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindow {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		Set<String> allWin  = driver.getWindowHandles();
		System.out.println(allWin.size());		
		//Last Window
		for (String eachWin : allWin) {
			driver.switchTo().window(eachWin);	
		}
		
		//First Window
		allWin  = driver.getWindowHandles();
		for (String eachWin : allWin) {
			driver.switchTo().window(eachWin);
			break;
		}
		
		
		//Specific Window(only for Interview point of view)
		int i =1;
		allWin  = driver.getWindowHandles();
		for (String eachWin : allWin) {
			driver.switchTo().window(eachWin);			
			if(i==2){
				break;	
			}
			i++;
			
		}
		
		
		
		
		
		
		
		
		
		
		










	}

}
