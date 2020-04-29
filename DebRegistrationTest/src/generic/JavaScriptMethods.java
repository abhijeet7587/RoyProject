package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptMethods
{
	/**
	 * This method is used to click on the the web Element. It handles Element not interactabale exception
	 * 
	 * @param driver
	 * @param we
	 */
	public void clickonWE(WebDriver driver, WebElement we)
	{
		//WebElement ContinueWe = driver.findElement(By.xpath(hp.ContinueXpath));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", we);
	}
	
	public void scrollThePageDown(WebDriver driver)
	{
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)");
		
	}

}
