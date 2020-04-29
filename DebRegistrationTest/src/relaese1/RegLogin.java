package relaese1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import excel.CreateExcelSheet;
import generic.BaseClass;
import generic.FleLib;
import generic.JavaScriptMethods;
import objectRepository.LoginPage;
import objectRepository.LoginRegistrationPage;
import objectRepository.registartionPage;

public class RegLogin extends BaseClass
{
	registartionPage rp=new registartionPage();
	FleLib fLInstance=new FleLib();
	JavaScriptMethods jsTnstance=new JavaScriptMethods();
	LoginPage lp=new LoginPage();
	LoginRegistrationPage lrp=new LoginRegistrationPage();
	JavaScriptMethods jsinstance=new JavaScriptMethods();
	@Test
	public void configureRegLoginTest() throws Throwable
	{
		System.out.println("Click on SignUP");
		WebElement SignUpWe=driver.findElement(By.xpath(rp.SignUpXpath));
		SignUpWe.click();
		
		//Get Test Data
		CreateExcelSheet ces=new CreateExcelSheet();
//		System.out.println(ces.getExcelNumericData());
//		ces.getExcelData();
		
		String emailID=ces.getExcelStringData("CommonData",13,0);
		System.out.println(emailID);
		long phone=ces.getExcelNumericData("CommonData",13,1);
		System.out.println(phone);
//		String pwd=ces.getExcelStringData("CommonData",13,2);
//		System.out.println(pwd);
//		String signatoryFirm=ces.getExcelStringData("CommonData",13,3);
//		System.out.println(signatoryFirm);
//		String firmName=ces.getExcelStringData("CommonData",13,4);
//		System.out.println(firmName);
//		String role=ces.getExcelStringData("CommonData",13,5);
//		System.out.println(role);
//		String website=ces.getExcelStringData("CommonData",13,6);
//		System.out.println(website);
//		String linkedIn=ces.getExcelStringData("CommonData",13,7);
//		System.out.println(linkedIn);
//		//String role=ces.getExcelStringData("CommonData",13,8);
//		String NOE=ces.getExcelStringData("CommonData",13,8);
//		System.out.println(NOE);
//		String chooseMethod=ces.getExcelStringData("CommonData",13,9);
//		System.out.println(chooseMethod);
//		String NOY=ces.getExcelStringData("CommonData",13,10);
//		System.out.println(NOY);
//		String representativeSection=ces.getExcelStringData("CommonData",13,11);
//		System.out.println(representativeSection);
//		String cities=ces.getExcelStringData("CommonData",13,12);
//		System.out.println(cities);
//		String type=ces.getExcelStringData("CommonData",13,13);
//		System.out.println(type);
//		System.out.println(ces.getExcelStringData("CommonData",13,1));
		//System.out.println(ces.getExcelNumericData());
		
		
		
		
		System.out.println("Click on Consluting Firm");
		//WebElement ConsltingFirmWe=driver.findElement(By.xpath(rp.ConsltingFirmXpath));
		//ConsltingFirmWe.click();
		Thread.sleep(3000);
		WebElement ConsltingFirmWe = driver.findElement(By.xpath(rp.ConsultingFirmXpath));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", ConsltingFirmWe);
		
		System.out.println("Registation Testing Start");
		System.out.println("Get Test Data from Properties file");
		String firstName9=fLInstance.getPropertyKeyValue("FName8");
		String lastName9=fLInstance.getPropertyKeyValue("LName8");
		String emailID9=fLInstance.getPropertyKeyValue("Email8");
		String pwd9=fLInstance.getPropertyKeyValue("Pass8");
		String Phone8=fLInstance.getPropertyKeyValue("Phone8");
		String SignatoryFirm8=fLInstance.getPropertyKeyValue("SignatoryFirm8");
		String FirmName8=fLInstance.getPropertyKeyValue("FirmName8");
		String Website8=fLInstance.getPropertyKeyValue("Website8");
		String LinkedIn8=fLInstance.getPropertyKeyValue("LinkedIn8");
		System.out.println("TestData : "+firstName9+" "+lastName9+" "+lastName9+" "+pwd9+" "+Phone8+" "+SignatoryFirm8+" "+FirmName8+" "+Website8+" "+LinkedIn8+" ");
	
		System.out.println("Enter First Name");
		WebElement FirstNameWe=driver.findElement(By.xpath(rp.FirstNameXpath));
		FirstNameWe.sendKeys(firstName9);
		
		System.out.println("Enter Last Name");
		WebElement LastNameWe=driver.findElement(By.xpath(rp.LastNameXpath));
		LastNameWe.sendKeys(lastName9);
		
		System.out.println("Enter Email ID");
		WebElement EmailIDWe=driver.findElement(By.xpath(rp.EmailIDXpath));
		EmailIDWe.sendKeys(emailID9);
		
		System.out.println("Enter required Password");
		WebElement PasswordWe=driver.findElement(By.xpath(rp.PasswordXpath));
		PasswordWe.sendKeys(pwd9);
		
		System.out.println("Enter required Phone Number");
		WebElement PhoneWe=driver.findElement(By.xpath(rp.PhoneXpath));
		PhoneWe.sendKeys(Phone8);
		
		System.out.println("Click on Next Button");
		WebElement NextBtnWe=driver.findElement(By.xpath(rp.NextBtnXpath));
		NextBtnWe.click();
		
		System.out.println("Enter 6 digit OTP");
		jsTnstance.scrollThePageDown(driver);
		
		WebElement OTPWe=driver.findElement(By.xpath(rp.OTPFieldXpath));
//		boolean value=OTPWe.isEnabled();
//		System.out.println("OTP fiel is displayed: "+value);
		Thread.sleep(3000);
		OTPWe.sendKeys("123456");
		
		System.out.println("Click on Submit Button");
		WebElement SubmitWe=driver.findElement(By.xpath(rp.SubmitBtnXpath));
		//SubmitWe.click();
		
		///////Login Application and Complete Registration process ///////////////////
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		System.out.println("New tab");
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,"t");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "T");   
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.open()");
		
		//((JavascriptExecutor)getDriver()).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		System.out.println("Total tabs:"+tabs.size());
	    driver.switchTo().window(tabs.get(1));
	    driver.get("http://gen2.web.gigbig.co/home");
		
	    System.out.println("Navigate to Login Page");
		WebElement LoginWe=driver.findElement(By.xpath(lp.LogInXpath));
		LoginWe.click();
		
		Thread.sleep(3000);
	    System.out.println("Enter  Phone Number");
	    //String Phone8=fLInstance.getPropertyKeyValue("Phone8");
		WebElement Phone8We=driver.findElement(By.xpath(lp.PhoneXpath));
		Phone8We.sendKeys(Phone8);
		
		System.out.println("Enter  Password");
	   // String Password9=fLInstance.getPropertyKeyValue("Pass8");
		WebElement Password9We=driver.findElement(By.xpath(lp.PasswordXpath));
		Password9We.sendKeys(pwd9);
		
		System.out.println("Click on Login Button");
		WebElement LoginBtnWe=driver.findElement(By.xpath(lp.LoginbtnXpath));
		LoginBtnWe.click();
		
		Thread.sleep(3000);
		System.out.println("Enter Signatory firm");
		WebElement SignatoryFirmWe=driver.findElement(By.xpath(lrp.SignatoryFirmXpath));
		SignatoryFirmWe.sendKeys(SignatoryFirm8);
		
		System.out.println("Enter firm Name");
		
		WebElement FirmNameWe=driver.findElement(By.xpath(lrp.FirmNameXpath));
		
		FirmNameWe.sendKeys(FirmName8);
		
		System.out.println("Select role as CEO");
		Thread.sleep(2000);
		driver.findElement(By.xpath(lrp.RoleXpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(lrp.RoleCEOXpath)).click();
		
		System.out.println("Enter Website");
		Thread.sleep(1000);
		WebElement WebsiteWe=driver.findElement(By.xpath(lrp.WebsiteXpath));
		WebsiteWe.sendKeys(Website8);
		
		System.out.println("Enter Linkdin");
		WebElement LinkdinWe=driver.findElement(By.xpath(lrp.LinkdinXpath));
		LinkdinWe.sendKeys(LinkedIn8);
		
		System.out.println("Select Number of Employees as 21-50 ");
		driver.findElement(By.xpath(lrp.NOEXpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(lrp.NOE2150Xpath)).click();
		Thread.sleep(2000);
		
		System.out.println("Choose method to register");
		System.out.println("Scroll the page");
		jsinstance.scrollThePageDown(driver);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(lrp.Method2RegisterXpath)).click();
		
		System.out.println("Select Number of Years as 3 ");
		Thread.sleep(2000);
		WebElement NOYWe=driver.findElement(By.xpath(lrp.NOYXpath));
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click()", NOYWe);
		NOYWe.click();
	
		Thread.sleep(2000);
		driver.findElement(By.xpath(lrp.NOY3Xpath)).click();
		
		System.out.println("Select Representative Sector  ");
		Thread.sleep(3000);
		driver.findElement(By.xpath(lrp.RepresentativeSectorXpath)).click();
		
		System.out.println("Chosse City ");
		Thread.sleep(2000);
		driver.findElement(By.xpath(lrp.CityXpath)).click();
		
		System.out.println("Register type ");
		Thread.sleep(2000);
		driver.findElement(By.xpath(lrp.ConsultingFirmXpath)).click();
		
		System.out.println("Click on Submit");
		Thread.sleep(2000);
		WebElement SubmibtntWe = driver.findElement(By.xpath(lrp.SubmitBtnXpath));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click()", SubmibtntWe);
		
		Thread.sleep(3000);
		System.out.println("Click on the continnue");
		WebElement ContinueWe = driver.findElement(By.xpath(lrp.SubmitBtnXpath));
		ContinueWe.click();
		
		
	
	}

}
