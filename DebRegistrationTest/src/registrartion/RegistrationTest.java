package registrartion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.FleLib;
import generic.JavaScriptMethods;
import objectRepository.registartionPage;

public class RegistrationTest extends BaseClass
{
	registartionPage rp=new registartionPage();
	FleLib fLInstance=new FleLib();
	JavaScriptMethods jsTnstance=new JavaScriptMethods();
	@Test
	public void registrationTest() throws Throwable
	{
		System.out.println("Click on SignUP");
		WebElement SignUpWe=driver.findElement(By.xpath(rp.SignUpXpath));
		SignUpWe.click();
		
		System.out.println("Click on Consluting Firm");
		//WebElement ConsltingFirmWe=driver.findElement(By.xpath(rp.ConsltingFirmXpath));
		//ConsltingFirmWe.click();
		Thread.sleep(3000);
		WebElement ConsltingFirmWe = driver.findElement(By.xpath(rp.ConsultingFirmXpath));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", ConsltingFirmWe);
		
		System.out.println("Registation Testing Start");
		System.out.println("Get Test Data from Properties file");
		String firstName1=fLInstance.getPropertyKeyValue("FName1");
		String lastName1=fLInstance.getPropertyKeyValue("LName1");
		String emailID1=fLInstance.getPropertyKeyValue("Email1");
		String pwd1=fLInstance.getPropertyKeyValue("Pass1");
		String phone1=fLInstance.getPropertyKeyValue("Phone1");
		System.out.println("TestData : "+firstName1+lastName1+lastName1+pwd1+phone1);
		
		System.out.println("Enter First Name");
		WebElement FirstNameWe=driver.findElement(By.xpath(rp.FirstNameXpath));
		FirstNameWe.sendKeys(firstName1);
		
		System.out.println("Enter Last Name");
		WebElement LastNameWe=driver.findElement(By.xpath(rp.LastNameXpath));
		LastNameWe.sendKeys(lastName1);
		
		System.out.println("Enter Email ID");
		WebElement EmailIDWe=driver.findElement(By.xpath(rp.EmailIDXpath));
		EmailIDWe.sendKeys(emailID1);
		
		System.out.println("Enter required Password");
		WebElement PasswordWe=driver.findElement(By.xpath(rp.PasswordXpath));
		PasswordWe.sendKeys(pwd1);
		
		System.out.println("Enter required Phone Number");
		WebElement PhoneWe=driver.findElement(By.xpath(rp.PhoneXpath));
		PhoneWe.sendKeys(phone1);
		
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
		jsTnstance.scrollThePageDown(driver);
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//executor.executeScript("window.scrollBy(0,1000)");
		//bool value=driver.findElement(By.xpath(rp.OTPFieldXpath));
		WebElement OTPWe=driver.findElement(By.xpath(rp.OTPFieldXpath));
		

		
		boolean value=OTPWe.isEnabled();
		System.out.println("OTP fiel is displayed: "+value);
		Thread.sleep(3000);
		OTPWe.sendKeys("123456");
		
		System.out.println("Click on Submit Button");
		WebElement SubmitWe=driver.findElement(By.xpath(rp.SubmitBtnXpath));
		SubmitWe.click();
	}

}
