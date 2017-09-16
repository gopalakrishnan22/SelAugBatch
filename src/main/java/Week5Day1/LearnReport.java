package Week5Day1;

import java.io.File;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LearnReport {

	public ExtentReports extent;
	public ExtentTest  test;


	public void reportStep(String desc, String status) {		
		if(status.equalsIgnoreCase("PASS")){
			test.log(LogStatus.PASS, desc
					+test.addScreenCapture("./snaps/snap4.jpeg"));				
		} else if(status.equalsIgnoreCase("FAIL")){			
			test.log(LogStatus.FAIL, desc
					+test.addScreenCapture("./snaps/snap3.jpeg"));
		} else if(status.equalsIgnoreCase("INFO")){			
			test.log(LogStatus.INFO, desc
					+test.addScreenCapture("./snaps/snap3.jpeg"));
		}
	}
	

	@BeforeSuite
	public void startResult(){	
		extent = new ExtentReports("./reports/report.html", false);
		extent.loadConfig(new File("./src/main/resources/extent-Config.xml"));
	}
	
	@BeforeMethod
	public void startTestCase(){
		test =extent.startTest("TC001", "Creates a New Lead");
		test.assignCategory("smoke");
		test.assignAuthor("Sarath");
	}

	@AfterMethod	
	public void endTest(){
		extent.endTest(test);
	}

	@AfterSuite
	public void endResult(){
		extent.flush();	
	}

}
