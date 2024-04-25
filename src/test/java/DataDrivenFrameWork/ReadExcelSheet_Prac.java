package DataDrivenFrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet_Prac extends PropertyClass {
	
	
	
	public static String method() throws IOException {
	File file = new File(System.getProperty("user.dir")+getProperty("location"));
		System.out.println("file   "+file);
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(stream);
//		XSSFSheet sheet = book.getSheet("Sheet1");
		XSSFSheet sheetAt = book.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		System.out.println("lastRowNum "+lastRowNum);
		int lastCellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println("lastCellNum  "+lastCellNum);
		String stringCellValue2 = null;
		for (int i =0;i<lastRowNum;i++) {
			for (int j=0; j<lastCellNum;j++) {
				XSSFCell cell = sheetAt.getRow(i).getCell(j);
				stringCellValue2 = cell.getStringCellValue();
				System.out.println(stringCellValue2);		
			}
		}
		return stringCellValue2;
	}

	public static String userName() throws IOException {
		File file = new File(System.getProperty("user.dir")+getProperty("location"));
			System.out.println("file   "+file);
			FileInputStream stream = new FileInputStream(file);
			XSSFWorkbook book = new XSSFWorkbook(stream);
//			XSSFSheet sheet = book.getSheet("Sheet1");
			XSSFSheet sheetAt = book.getSheetAt(0);
			int lastRowNum = sheetAt.getPhysicalNumberOfRows();
			System.out.println("lastRowNum "+lastRowNum);
			int lastCellNum = sheetAt.getRow(0).getPhysicalNumberOfCells();
			System.out.println("lastCellNum  "+lastCellNum);
			String stringCellValue2 = null;
			for (int i =0;i<lastRowNum;i++) {
				for (int j=0; j<1;j++) {
					XSSFCell cell = sheetAt.getRow(i).getCell(j);
					stringCellValue2 = cell.getStringCellValue();
					System.out.println(stringCellValue2);		
				}
			}
		return stringCellValue2;
		}
	
public static String passWord() throws IOException {
	File file = new File(System.getProperty("user.dir")+getProperty("location"));
		System.out.println("file   "+file);
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(stream);
//		XSSFSheet sheet = book.getSheet("Sheet1");
		XSSFSheet sheetAt = book.getSheetAt(0);
		int lastRowNum = sheetAt.getPhysicalNumberOfRows();
		System.out.println("lastRowNum "+lastRowNum);
		int lastCellNum = sheetAt.getRow(0).getPhysicalNumberOfCells();
		System.out.println("lastCellNum  "+lastCellNum);
		String stringCellValue2 = null;
		for (int i =0;i<lastRowNum;i++) {
			for (int j=1; j<=1;j++) {
				XSSFCell cell = sheetAt.getRow(i).getCell(j);
				stringCellValue2 = cell.getStringCellValue();
				System.out.println(stringCellValue2);		
			}
		}
		return stringCellValue2;
	}

	public static String [][] method2() throws IOException {
		File file = new File(System.getProperty("user.dir")+getProperty("location"));
			System.out.println("file   "+file);
			FileInputStream stream = new FileInputStream(file);
			XSSFWorkbook book = new XSSFWorkbook(stream);
//			XSSFSheet sheet = book.getSheet("Sheet1");
			XSSFSheet sheetAt = book.getSheetAt(0);
			int lastRowNum = sheetAt.getPhysicalNumberOfRows();
			System.out.println("lastRowNum "+lastRowNum);
			int lastCellNum = sheetAt.getRow(0).getPhysicalNumberOfCells();
			System.out.println("lastCellNum  "+lastCellNum);
			String [][]result=new String[lastRowNum][lastCellNum];
			for (int i =0;i<lastRowNum;i++) {
				for (int j=0; j<lastCellNum;j++) {
					XSSFCell cell = sheetAt.getRow(i).getCell(j);
					String stringCellValue2 = cell.getStringCellValue();
//					System.out.println(stringCellValue2);
					result [i][j]= stringCellValue2;
					System.out.println(result[i][j]);
				}
			}
			return result;
		}

	
	
}
