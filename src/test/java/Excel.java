import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import org.testng.annotations.Test;

public class Excel {
  @Test
  public void f() throws IOException {
	  XSSFWorkbook xw=new XSSFWorkbook();
	  FileOutputStream fos=new FileOutputStream(new File("Data.xlsx"));
	  XSSFSheet xs=xw.createSheet("TestMeApp");
	  System.out.println(xs.getSheetName());
	  xw.write(fos);
	  fos.close();
  }
}
