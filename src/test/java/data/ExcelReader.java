package data;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {

	static FileInputStream fis = null;
	public FileInputStream getFileInputStream() {
		String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\data\\userData.xlsx";
		File scrFile = new File(filePath);
		try {
			fis = new FileInputStream(scrFile);
		} catch (FileNotFoundException e) {
			System.out.println("Test Data file not found terminating process !! : Check file path of TestData");
			System.exit(0);
		}
		return fis;
	}

	public Object[][] getExcelData() throws IOException{
		fis = getFileInputStream();
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet  = workbook.getSheetAt(0);
		int totalNumberOfRows = (sheet.getLastRowNum()+1);
		int totalNumberOfCol = 4;
		String[][] arrayExcelData = new String[totalNumberOfRows][totalNumberOfCol];
		for (int i = 0; i < totalNumberOfRows; i++) {
			for (int j = 0; j < totalNumberOfCol; j++) {
				XSSFRow row = sheet.getRow(i);
				arrayExcelData[i][j] = row.getCell(j).toString();
			}
		}
		workbook.close();
		return arrayExcelData;
	}
}
