package utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream fis=new FileInputStream("./Testdata/excel.xlsx");
		            Workbook book = WorkbookFactory.create(fis);
		            Sheet sh = book.getSheet("Sheet1");
		            Object[][] data = new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		    		for(int i=0;i<sh.getRow(0).getLastCellNum();i++)
		    		{
		    			for(int k=0;k<sh.getRow(0).getLastCellNum();k++)
		    			{
		    				sh.getRow(i).getCell(k).toString();
		    			}
		    		}
		    		for(int i=0;i<data.length;i++)
		    		{
		    			System.out.println(data[i]);
		    		}
		

	}

}
