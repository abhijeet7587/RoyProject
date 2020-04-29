package excel;

import org.testng.annotations.Test;

import generic.FileLib;

public class ReadExcelTestData 
{
	FileLib flInstance=new FileLib();

	@Test
	public void getTestCaseData() throws Throwable
	{
		String FName8=flInstance.getExcelStringData("CommonData", 1, 0);
		System.out.println("FName8"+FName8);
		long num=flInstance.getExcelLongData("CommonData", 1, 1);
		System.out.println(num);
		
		
		
		
		
		
 
	}
}
