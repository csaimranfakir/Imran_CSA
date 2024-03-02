package org.DropDownHandelling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DefaultValue 
{

	public static void main(String[] args) 
	{
		//we are using chrome browser as a web driver
		WebDriver driver = new ChromeDriver();
		
		//to handle the NoSuchElementException
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//to maximize the driver window
		driver.manage().window().maximize();
		
		//to hit the URL
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		//Web element of countries dropdown
		WebElement countriesDD = driver.findElement(By.xpath("//select"));
		
		//to handle the drop down we are using Select class and its respective methods
		Select sle = new Select(countriesDD);
		
		//to verify that the default value of dropdown is Afghanistan or not we are using a method "getFirstSelectedOption()
		//along with the getText() method to get all the country text/names
		System.out.println(sle.getFirstSelectedOption().getText());
		
		//to close the driver window
		driver.quit();

	}

}
