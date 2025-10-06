package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void openURL(String URL)
	{
		driver.get(URL);
	}
	public static void waitForElementToLoad(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static WebElement findElementByID(String elementID)
	{
		waitForElementToLoad(driver.findElement(By.id(elementID)));
		return driver.findElement(By.id(elementID));
	}
	public static WebElement findElementByXPath(String elementXPath)
	{
		waitForElementToLoad(driver.findElement(By.xpath(elementXPath)));
		return driver.findElement(By.xpath(elementXPath));
	}
	
	public static WebElement findElementByLinkText(String linkText)
	{
		waitForElementToLoad(driver.findElement(By.id(linkText)));
		return  driver.findElement(By.linkText(linkText));
	}
	
	public static void enterText(WebElement element, String text)
	{
		element.sendKeys(text);		
	}
	
	public static void click(WebElement element)
	{
		element.click();
	}
}
