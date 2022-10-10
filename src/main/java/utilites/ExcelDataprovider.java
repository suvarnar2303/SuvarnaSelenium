package utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataprovider {
	 
	public Object[][] Exceldata(String filepath,String Sheetname) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(Sheetname);
		Object[][] data = new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		for(int i=0;i<sh.getRow(0).getLastCellNum();i++)
		{
			for(int k=0;k<sh.getRow(0).getLastCellNum();k++)
			{
				sh.getRow(i).getCell(k).toString();
			}
		}
		return data;
//		   Row r = sh.getRow(row);
//		        Cell c = r.getCell(cell);
//		        String val = c.getStringCellValue();
//		        return val; 
	}

}
