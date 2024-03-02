package org.BrowserOptions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JustDial 
{

	public static void main(String[] args) 
	{
		/*ChromeOptions is a separate class selenium and it extends MulableCapabilities class,
		  since, Selenium by default opens a fresh instance of a browser so to perform any browser 
		  specific operations like, To maximize or to disable notifications or to run program headless 
		  we use ChromeOptions 
		*/
		ChromeOptions co = new ChromeOptions();

		co.addArguments("disable-notifications");//it will disable all the notifications of webpage
		co.addArguments("start-maximized"); //it will maximize mode when the webpage will open
		co.addArguments("headless"); //it will run the we apllication in background mode
		co.addArguments("remote-allow-origins=*"); // this is use to handle the "ConnectionFailedException".
		
		/*here we have created a class object of ChromeDriver class and in the constructor of ChromeDriver class we have
		 mentioned the reference object of ChromeOptions as we are handeling our script by usning ChromeOptions class*/
		WebDriver driver = new ChromeDriver(co);
		//here we used Implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.get("https://www.carwale.com");

		System.out.println(driver.getTitle());

	}

}
