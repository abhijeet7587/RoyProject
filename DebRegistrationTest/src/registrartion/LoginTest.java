package registrartion;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.FleLib;
import generic.JavaScriptMethods;
import objectRepository.LoginPage;
import objectRepository.LoginRegistrationPage;
import objectRepository.registartionPage;

public class LoginTest extends BaseClass
{
	registartionPage rp=new registartionPage();
	FleLib fLInstance=new FleLib();
	LoginPage lp=new LoginPage();
	LoginRegistrationPage lrp=new LoginRegistrationPage();
	JavaScriptMethods jsinstance=new JavaScriptMethods();
	@Test
	public void loginTest() throws Throwable
	{
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
	    String phone5=fLInstance.getPropertyKeyValue("Phone5");
		WebElement PhoneWe=driver.findElement(By.xpath(lp.PhoneXpath));
		PhoneWe.sendKeys(phone5);
		
		System.out.println("Enter  Password");
	    String Password5=fLInstance.getPropertyKeyValue("Pass5");
		WebElement PasswordWe=driver.findElement(By.xpath(lp.PasswordXpath));
		PasswordWe.sendKeys(Password5);
		
		System.out.println("Click on Login Button");
		WebElement LoginBtnWe=driver.findElement(By.xpath(lp.LoginbtnXpath));
		LoginBtnWe.click();
		
		Thread.sleep(3000);
		System.out.println("Enter Signatory firm");
		WebElement SignatoryFirmWe=driver.findElement(By.xpath(lrp.SignatoryFirmXpath));
		SignatoryFirmWe.sendKeys("JLesterAlaxander");
		
		System.out.println("Enter firm Name");
		
		WebElement FirmNameWe=driver.findElement(By.xpath(lrp.FirmNameXpath));
		
		FirmNameWe.sendKeys("AEA Group");
		
		System.out.println("Select role as CEO");
		Thread.sleep(2000);
		driver.findElement(By.xpath(lrp.RoleXpath)).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(lrp.RoleCEOXpath)).click();
		
		System.out.println("Enter Website");
		Thread.sleep(1000);
		WebElement WebsiteWe=driver.findElement(By.xpath(lrp.WebsiteXpath));
		WebsiteWe.sendKeys("https://www.aeagroup.com/");
		
		System.out.println("Enter Linkdin");
		WebElement LinkdinWe=driver.findElement(By.xpath(lrp.LinkdinXpath));
		LinkdinWe.sendKeys("https://www.linkedin.com/company/aeagroup/");
		
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
		WebElement SubmitWe = driver.findElement(By.xpath(lrp.SubmitBtnXpath));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click()", SubmitWe);
		
		Thread.sleep(3000);
		System.out.println("Click on the continnue");
		WebElement ContinueWe = driver.findElement(By.xpath(lrp.SubmitBtnXpath));
		ContinueWe.click();
		
	}

}
