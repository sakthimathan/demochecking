package DataDrivenFrameWork;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataDriver {

	@DataProvider(name = "login")
	public String[][] GetuserData() throws IOException {
		//String[][] data = new String[2][2];

		 //String[][] data = ReadExcel.getExcelData();
		 String[][] data = ReadExcelSheet_Prac.method2();
//		data[0][0] = "koushik350@gmail.com";
//		data[0][1] = "Pass123$";
//
//		data[1][0] = "koushik1@letcode.in";
//		data[1][1] = "Pass123$";
		return data;

	}

}
