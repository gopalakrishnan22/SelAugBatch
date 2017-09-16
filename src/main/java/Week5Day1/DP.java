package Week5Day1;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

public class DP {

	@DataProvider(name = "fetchData")
	public Object[][] getData() throws InvalidFormatException, IOException{	
		return ExcelRead.ReadExcel();	
	}	
}

/*	Object[][] data = new Object[2][2];
		data[0][0] = "Testleaf";
		data[0][1] = "Sethu";
	
		data[1][0] = "QEagle";
		data[1][1] = "Sharath";
	
*/




