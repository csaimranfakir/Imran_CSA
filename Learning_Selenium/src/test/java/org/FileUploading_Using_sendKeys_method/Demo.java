package org.FileUploading_Using_sendKeys_method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");
		
		WebDriver driver  = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		
		driver.findElement(By.name("input4[]")).sendKeys("C:\\Users\\KRUSHNA\\Pictures\\Screenshots\\Screenshot 2023-11-06 220940.png");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
