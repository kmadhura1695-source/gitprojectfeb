package day3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadrivenframe {

	public static void main(String[] args) throws IOException {
	String filepath="‪D:\\datadriven.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet(filepath);
	int rows=sheet.getLastRowNum();
	System.out.println("Total No of Rows:"+rows);
	}

}
