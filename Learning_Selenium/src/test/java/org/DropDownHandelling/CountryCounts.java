package org.DropDownHandelling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountryCounts 
{

	public static void main(String[] args) 
	{
		//we are using chrome browser as Web Driver
		WebDriver driver = new ChromeDriver();
		
		//to handle the NoSuchElementException
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//to maximize the driver window
		driver.manage().window().maximize();
		
		//to hit the URL
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		//web element of countries drop down
		WebElement countriesDD = driver.findElement(By.xpath("//select"));
		
		//to fetch the options of drop down we will create a class object of Select class and to
		//fetch the options we will use its respective methods
		Select sle = new Select(countriesDD);
		
		//here we are going to use the getOptions method which return a all the options in the List format
		//and for that we created a object of it
		List <WebElement> countriesCount = sle.getOptions();
		
		//to print the total count of countries
		System.out.println(countriesCount.size());
		
		//to close the driver
		driver.quit();

	}

}
