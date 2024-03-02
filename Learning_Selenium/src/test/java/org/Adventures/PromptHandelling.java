package org.Adventures;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptHandelling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoqa.com/alerts");
		
		WebElement promptCTA = driver.findElement(By.id("promtButton"));
		promptCTA.click();
		
		//To switch it from driver to alerts
		Alert alert = driver.switchTo().alert();
		
		//to print the prompt box text
		System.out.println(alert.getText());
		
		//to check the functionality we will put some value in it
		alert.sendKeys("Hi, Welcome to Selenium Learning!!!");
		
		alert.accept();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
