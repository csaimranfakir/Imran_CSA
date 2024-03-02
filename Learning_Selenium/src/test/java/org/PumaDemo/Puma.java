package org.PumaDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Puma 
{

	public static void main(String[] args) 
	{
		//we need a WebDriver here so we are going to use Google Chrome Browser here
		ChromeDriver driver = new ChromeDriver();
		
		//to maximize the driver window automatically
		driver.manage().window().maximize();
		
		//to handle NoSuchElementException
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//to hit the URL
		driver.get("https://in.puma.com/in/en");
		
		//to find the WebElement of Hamburger Icon
		WebElement profileIcon = driver.findElement(By.xpath("(//div[@data-uds-child=\"icon\"])[5]"));
		
		//to click on ProfileIcon
		profileIcon.click();
		
		//to go on login window
		WebElement loginPage = driver.findElement(By.xpath("//a[@data-test-id=\"login-button\"]"));
		loginPage.click();
		
		//now we are going to select login by using email and password option
		WebElement loginByUsingEmailAndPassword = driver.findElement(By.xpath("//button[@data-test-id=\"otp-login-with-email-password\"]"));
		loginByUsingEmailAndPassword.click();
		
		//WebElement of userName
		WebElement userName = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		userName.sendKeys("your username");
		
		//WebElement of password
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys("your password");
		
		//WebElement of LoginButton
		WebElement loginButton = driver.findElement(By.xpath("//button[@data-test-id=\"auth-button-login\"]"));
		loginButton.click();
		
		//WebElement of myAccount
		WebElement myAccount = driver.findElement(By.xpath("//span[text()=\"My account\"]"));
		System.out.println(myAccount.isDisplayed());
		
		//to logout the user
		WebElement logout = driver.findElement(By.xpath("//div[text()=\"Logout\"]"));
		logout.click();
		
		//to close the driver
		driver.quit();

	}

}
