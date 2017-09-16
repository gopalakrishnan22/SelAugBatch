package Week5Day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {

	@Test
	public static String[][] ReadExcel() throws IOException, InvalidFormatException {

		String[][] data = null;
		
		//Open the Excel File(specify the Path)
		File file = new File("./data/Login.xlsx");
	//	FileInputStream fis = new FileInputStream(file);

		//OpenWorkBook
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		//Enter into the Sheet(Using Sheet Index)
		XSSFSheet sheet = wb.getSheetAt(0);

		//Row Count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		//Column Count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		data = new String[rowCount][columnCount];
		//for Loop (Rows)
		for (int i = 1; i <=rowCount; i++) {
			//Enter into the rows
			XSSFRow row = sheet.getRow(i);			

			//for Loop (columns)
			for (int j = 0; j <columnCount; j++) {
				//Enter into the Column
				XSSFCell cell = row.getCell(j);
				//Read the String Value
				
				//System.out.println(cell.getStringCellValue());
				data[i-1][j] = cell.getStringCellValue();					
			}
		}
		return data;

	}
}


