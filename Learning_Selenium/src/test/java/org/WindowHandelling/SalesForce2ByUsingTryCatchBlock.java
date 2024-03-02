package org.WindowHandelling;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce2ByUsingTryCatchBlock 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
		
		driver.get("https://www.salesforce.com/in/");
		
		WebElement StartFreeTrialCTA = driver.findElement(By.xpath("(//a[contains(text() , 'Start free')])[1]"));
		StartFreeTrialCTA.click();
		
		
		Set <String> allWinIds = driver.getWindowHandles();
		Iterator <String> ite = allWinIds.iterator();
		//ite.next();

		while ( ite.hasNext() )
		{
		try
		{
		driver.switchTo().window(ite.next());
		//WebElement emailField = driver.findElement(By.xpath("//input[contains(@id, 'UserEmail')]"));
		//emailField.sendKeys("hello123@gmail.com");
		break;
		}
		catch(NoSuchElementException e)
		{
		continue;
		}
		}
		
		
		Thread.sleep(1000);
		
//		driver.close();
		driver.quit();

	}

}
