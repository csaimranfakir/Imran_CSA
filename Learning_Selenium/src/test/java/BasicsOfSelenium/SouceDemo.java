package BasicsOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; //Selenium Dependancies

public class SouceDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Now we are going to test login functionality of Swag Labs website
		//so lets get started
		
		//first of all we need WebDriver here to open the website in a particular browser like Chrome, Edge or Safari
		//so we are going to use Chrome browser which is widely used or the FootFall Ratio of Chrome is high as compare to others.
		
		ChromeDriver driver = new ChromeDriver();
		//we can also make an object of the same by using WebDriver
		// WebDriver driver = new ChromeDriver();
		
		//now to maximize the browser automatically we will use beloiw line of code
		driver.manage().window().maximize();
		
		//everytime in selenium an exception is occures valled as "NoSuchElementException"
		//and to handle it we use below line of code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(3000);
		//now we have to hit the URL of Swag Labs website after opening the browser
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		//now we have to find the WebElement of username field and we have to enter the repective value into it
		WebElement userName = driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		Thread.sleep(3000);
		//now we have to enter the valid value into it by using the sendKeys() method
		userName.sendKeys("standard_user");
		Thread.sleep(3000);
		//now for password we have to find the WebElement
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		Thread.sleep(3000);
		//use the sendKeys method to put password value
		password.sendKeys("secret_sauce");
		
		//now we have to hit login  buttuon also to get logged in and for that 
		//we should have WebElement of login button to locate it
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		
		//and now we will use a method click() to click the login buttuon automatically
		loginButton.click();
		
		WebElement backpack = driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]"));
		System.out.println(backpack.isDisplayed());
		
		//we will use Thread.sleep() method to pause the exectuion for 5 seconds (it is not recommended thing but its just a
		//practice so we can use it)
		Thread.sleep(3000); //it will throw and InterruptedException and we will declare it in front of method body by using throws
		//keyword
		
		//now we will logout from the wesite
		//so there is a hamburger icon and in that icon logout functionality is present so first we need webElement of Hamburger icon
		//and then we need WebElement of logout button
		
		//WebElement for Hamburger Icon
		WebElement hamburgerButton = driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]"));
		
		//now to click on it we use below line of code
		hamburgerButton.click();
		
		//WebElement of LogOut link
		WebElement logOutFunctionality = driver.findElement(By.xpath("//a[@id=\"logout_sidebar_link\"]"));
		
		//to hit that logout button
		logOutFunctionality.click();	
		
		
		//now to close the browser or the web application automatically we have following line of code
		driver.quit();
		
		//huuuuurrrrreyyyyyyyyyyyy!!!! you successfully created and executed the first Selenium script of
		// verification of login functionality...... Congratulations Brother!!!!!!
		
		
		
		
		
		
		
		
		
		
		
	}

}
