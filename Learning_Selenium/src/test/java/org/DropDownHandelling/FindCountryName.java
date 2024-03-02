package org.DropDownHandelling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindCountryName 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Select a web driver as of now we will use Chrome browser
		WebDriver driver = new ChromeDriver();
		
		//to handle the NoSuchElementException by using Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//to maximize the window automatically
		driver.manage().window().maximize();
		
		//to hit the URL
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		//now create a we element of DropDown
		WebElement countriesDropDown = driver.findElement(By.xpath("//select"));
		
		//now we have to create a class object of Select class
		Select sle = new Select(countriesDropDown);
		
		//now all the data of that dropdown is stored in sle which is a reference of Select class and now we can use all the methods belongs to Select class
		sle.selectByVisibleText("India");
		
		Thread.sleep(3000);
		
		//to close the driver
		driver.quit();
		
		
		
	}

}
