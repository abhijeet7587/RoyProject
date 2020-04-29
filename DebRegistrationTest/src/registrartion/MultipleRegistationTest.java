package registrartion;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.FleLib;
import objectRepository.registartionPage;

public class MultipleRegistationTest extends BaseClass
{
	registartionPage rp=new registartionPage();
	FleLib fLInstance=new FleLib();
	@Test
	public void multipleRegTest() throws Throwable
	{
		System.out.println("Click on SignUP");
		WebElement SignUpWe=driver.findElement(By.xpath(rp.SignUpXpath));
		SignUpWe.click();
		
		System.out.println("Registation Testing Start");
		System.out.println("Get Test Data from Properties file 1");
		String firstName1=fLInstance.getPropertyKeyValue("FName1");
		String lastName1=fLInstance.getPropertyKeyValue("LName1");
		String emailID1=fLInstance.getPropertyKeyValue("Email1");
		String pwd1=fLInstance.getPropertyKeyValue("Pass1");
		String phone1=fLInstance.getPropertyKeyValue("Phone1");
		System.out.println("TestData : "+firstName1+" "+lastName1+" "+emailID1+" "+pwd1+" "+phone1);
		
		System.out.println("Get Test Data from Properties file 2");
		String firstName2=fLInstance.getPropertyKeyValue("FName2");
		String lastName2=fLInstance.getPropertyKeyValue("LName2");
		String emailID2=fLInstance.getPropertyKeyValue("Email2");
		String pwd2=fLInstance.getPropertyKeyValue("Pass2");
		String phone2=fLInstance.getPropertyKeyValue("Phone2");
		System.out.println("TestData : "+firstName2+" "+lastName2+" "+emailID2+" "+pwd2+" "+phone2);
		
		System.out.println("Get Test Data from Properties file 3");
		String firstName3=fLInstance.getPropertyKeyValue("FName3");
		String lastName3=fLInstance.getPropertyKeyValue("LName3");
		String emailID3=fLInstance.getPropertyKeyValue("Email3");
		String pwd3=fLInstance.getPropertyKeyValue("Pass3");
		String phone3=fLInstance.getPropertyKeyValue("Phone3");
		System.out.println("TestData : "+firstName3+" "+lastName3+" "+emailID3+" "+pwd3+" "+phone3);
		
		System.out.println("Get Test Data from Properties file 4");
		String firstName4=fLInstance.getPropertyKeyValue("FName4");
		String lastName4=fLInstance.getPropertyKeyValue("LName4");
		String emailID4=fLInstance.getPropertyKeyValue("Email4");
		String pwd4=fLInstance.getPropertyKeyValue("Pass4");
		String phone4=fLInstance.getPropertyKeyValue("Phone4");
		System.out.println("TestData : "+firstName4+" "+lastName4+" "+emailID4+" "+pwd4+" "+phone4);
		
		System.out.println("Get Test Data from Properties file");
		String firstName5=fLInstance.getPropertyKeyValue("FName5");
		String lastName5=fLInstance.getPropertyKeyValue("LName5");
		String emailID5=fLInstance.getPropertyKeyValue("Email5");
		String pwd5=fLInstance.getPropertyKeyValue("Pass5");
		String phone5=fLInstance.getPropertyKeyValue("Phone5");
		System.out.println("TestData : "+firstName5+" "+lastName5+" "+emailID5+" "+pwd5+" "+phone5);
		
		Thread.sleep(3000);
		WebElement ConsltingFirmWe = driver.findElement(By.xpath(rp.ConsultingFirmXpath));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", ConsltingFirmWe);	
		
		System.out.println("Enter First Name");
		WebElement FirstNameWe=driver.findElement(By.xpath(rp.FirstNameXpath));
		FirstNameWe.sendKeys(firstName5);
		
		System.out.println("Enter Last Name");
		WebElement LastNameWe=driver.findElement(By.xpath(rp.LastNameXpath));
		LastNameWe.sendKeys(lastName5);
		
		System.out.println("Enter Email ID");
		WebElement EmailIDWe=driver.findElement(By.xpath(rp.EmailIDXpath));
		EmailIDWe.sendKeys(emailID5);
		
		System.out.println("Enter required Password");
		WebElement PasswordWe=driver.findElement(By.xpath(rp.PasswordXpath));
		PasswordWe.sendKeys(pwd5);
		
		System.out.println("Enter required Phone Number");
		WebElement PhoneWe=driver.findElement(By.xpath(rp.PhoneXpath));
		PhoneWe.sendKeys(phone5);
		
//		System.out.println("Accept the term and conditions");
//		WebElement TermConnditionCheckBoxWe=driver.findElement(By.xpath(rp.TermConnditionCheckBoxXpath));
//		TermConnditionCheckBoxWe.click();
//		
//		Thread.sleep(3000);
//		System.out.println("Slectct the checkbox for the term and conditions");
//		WebElement AcceptBoxWe=driver.findElement(By.xpath(rp.AcceptBoxXpath));
//		AcceptBoxWe.click();
//		
//		System.out.println("Click on Done Button");
//		WebElement DoneWe=driver.findElement(By.xpath(rp.DoneBtnXpath));
//		DoneWe.click();
		System.out.println("Click on Next Button");
		WebElement NextBtnWe=driver.findElement(By.xpath(rp.NextBtnXpath));
		NextBtnWe.click();
		
		// This  will scroll down the page by  1000 pixel vertical		
		//executor.executeScript("window.scrollBy(0,1000)");
        
		System.out.println("Enter 6 digit OTP");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//executor.executeScript("window.scrollBy(0,1000)");
		//bool value=driver.findElement(By.xpath(rp.OTPFieldXpath));
		WebElement OTPWe=driver.findElement(By.xpath(rp.OTPFieldXpath));
		

		
		boolean value=OTPWe.isEnabled();
		System.out.println("OTP fiel is displayed: "+value);
		OTPWe.sendKeys("123456");
		
		System.out.println("Click on Submit Button");
		WebElement SubmitWe=driver.findElement(By.xpath(rp.SubmitBtnXpath));
		SubmitWe.click();
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		System.out.println("Total tabs:"+tabs.size());
	    driver.switchTo().window(tabs.get(0));
		
		
	}
	
	
	

}
