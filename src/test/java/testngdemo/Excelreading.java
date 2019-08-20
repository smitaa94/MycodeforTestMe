package testngdemo;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;

import org.testng.annotations.Test;



public class Excelreading {
  @Test
  public void f() throws Exception {
	  FileInputStream fos=new FileInputStream(new File("C:\\Users\\training_h2a.06.15\\Desktop\\TESTNG.xlsx"));
	  XSSFWorkbook xw=new XSSFWorkbook(fos);
	  XSSFSheet xs=xw.getSheet("Sheet1");
	  //row count
	  int rcount=xs.getLastRowNum();
	  String username=xs.getRow(1).getCell(0).getStringCellValue();
	  System.out.println(username);
	  //XSSFWorkbook xw1=new XSSFWorkbook();
	  xs.getRow(0).createCell(2).setCellValue("Status");
	  xs.getRow(2).createCell(2).setCellValue("Pass");
	  xs.getRow(3).createCell(2).setCellValue("Pass");
	  xs.getRow(4).createCell(2).setCellValue("Pass");
	  FileOutputStream fos1=new FileOutputStream(new File("C:\\Users\\training_h2a.06.15\\Desktop\\TESTNG.xlsx"));
	  xw.write(fos1);
	  fos1.close();
}
}
