package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib 
{
	public String getExcelStringData(String Sheet, int rowNum, int colNum) throws Throwable
	{
		String data="";
		//Create instance of Input File Stream
		FileInputStream fis= new FileInputStream(".\\TestData\\Test.xlsx");
		//Open Workbook in Read mode
		Workbook wb= WorkbookFactory.create(fis);
		//get the control of Sheet 1
		Sheet sh= wb.getSheet(Sheet);
		//get the control of rowNumt row
		Row row=sh.getRow(rowNum);
		Cell cel=row.getCell(colNum);
		if(cel.getCellType()==CellType.STRING)
		{
		 data= cel.getStringCellValue();
		System.out.println(data);
		}
		
				long num= (long) cel.getNumericCellValue();
				 System.out.println(num);
			
		//Close the workbook
		wb.close();
		return data;	
	}
	
	public long getExcelLongData(String Sheet, int rowNum, int colNum) throws Throwable
	{
		long num=0;
		//Create instance of Input File Stream
		FileInputStream fis= new FileInputStream(".\\Data\\Test.xlsx");
		//Open Workbook in Read mode
		Workbook wb= WorkbookFactory.create(fis);
		//get the control of Sheet 1
		Sheet sh= wb.getSheet(Sheet);
		//get the control of rowNumt row
		Row row=sh.getRow(rowNum);
		Cell cel=row.getCell(colNum);
		if(cel.getCellType()==CellType.NUMERIC)
		{
		num= (long) cel.getNumericCellValue();
		System.out.println(num);
		}
		
			
			
		//Close the workbook
		wb.close();
		return num;	
	}

}
