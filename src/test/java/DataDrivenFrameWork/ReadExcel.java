package DataDrivenFrameWork;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public static String[][] getExcelData() {

		String fileLocation = "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Codes\\UserData\\User-datas.xlsx";
		XSSFWorkbook wbook = null;
		try {
			wbook = new XSSFWorkbook(fileLocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

		System.out.println("Inclusive of header: " + physicalNumberOfRows);

		System.out.println("No.of Rows: " + lastRowNum);

		short lastCellNum = sheet.getRow(0).getLastCellNum();

		System.out.println("No.of cells:" + lastCellNum);

		String[][] data = new String[lastRowNum][lastCellNum];		
		for (int i = 0; i <lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
//				String value = cell.getStringCellValue();
//				System.out.println(value);
				data[i][j] = value;
                   
			}

		}
		return data;

	}
	@Test
	private void method1() {
		String fileLocation = "C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Codes\\UserData\\User-datas.xlsx";
		XSSFWorkbook wbook = null;
		try {
			wbook = new XSSFWorkbook(fileLocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

		System.out.println("Inclusive of header: " + physicalNumberOfRows);

		System.out.println("No.of Rows: " + lastRowNum);

		int lastCellNum = sheet.getRow(0).getLastCellNum();

		System.out.println("No.of cells:" + lastCellNum);

		String[][] data = new String[lastRowNum][lastCellNum];		
		for (int i = 0; i <lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum-1; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
//				String value = cell.getStringCellValue();
//				System.out.println(value);
				data[i][j] = value;
                   
			}

		}
		
	}
	

}

