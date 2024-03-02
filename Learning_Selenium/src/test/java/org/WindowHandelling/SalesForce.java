package org.WindowHandelling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForce 
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
		
		// now we have to write window handelling code here
		Set<String> allWindowIDs = driver.getWindowHandles();
		List<String> al = new ArrayList<String>(allWindowIDs);
		driver.switchTo().window(al.get(1));
		
		WebElement emailField = driver.findElement(By.xpath("//input[contains(@id, 'UserEmail')]"));
		emailField.sendKeys("hello123@gmail.com");
		
		Thread.sleep(1000);
		
//		driver.close();
		driver.quit();

	}

}
