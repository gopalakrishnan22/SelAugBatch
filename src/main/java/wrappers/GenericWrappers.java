package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWrappers implements Wrappers{
	RemoteWebDriver driver;
	int i = 1;

	public void invokeApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();	
		} else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer32.exe");
			driver = new InternetExplorerDriver();
		}
		System.out.println(browser +" opened successfully");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		takeSnap();
	}

	public void enterById(String idValue, String data) {
		try {
			driver.findElementById(idValue).sendKeys(data);
			System.out.println(data+" entered successfully in "+idValue);
		} catch (NoSuchElementException e) {
			System.err.println("The Element "+idValue+ " not found");
			throw new RuntimeException();
		} catch (ElementNotInteractableException e) {
			System.err.println("The Element "+idValue+ " not ready to enter");
			throw new RuntimeException();
		} catch (WebDriverException e){
			System.err.println("The Browser unreachable");	
			throw new RuntimeException();
		} catch (Exception e){
			System.err.println("Unknown Issue" +e.getMessage());	
			throw new RuntimeException();
		}finally {
			takeSnap();
		}
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub

	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub

	}

	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub

	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	public void clickById(String id) {
		// TODO Auto-generated method stub

	}

	public void clickByClassName(String classVal) {
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("The Element "+classVal+" is clicked");
		} catch (NoSuchElementException e) {
			System.err.println("The Element "+classVal+" is not clicked");
			throw new RuntimeException();
		} catch (WebDriverException e){
			System.err.println("The Browser unreachable");
			throw new RuntimeException();
		} finally {
			takeSnap();
		}
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub

	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub

	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub

	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub

	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub

	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub

	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub

	}

	public void switchToParentWindow() {
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
			break;
		}

	}

	public void switchToLastWindow() {
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
			
		}

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/snap"+i+".jpg");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;

	}

	public void closeBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}

}
