package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public static WebDriver driver=null;
	@BeforeClass
	public void configureBC()
	{
		System.out.println("Opent the broser ");
		driver = new ChromeDriver();
		System.out.println("Navigate to registartion URL ");
		driver.get("http://stage.web.gigbig.co/login");
		driver.manage().window().maximize();
		
	}

	@AfterClass
	public void configureAC()
	{
		System.out.println("Close the browser");
		//driver.close();
		
		
	}
}
