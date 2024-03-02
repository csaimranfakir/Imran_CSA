package org.DropDownHandelling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetALlTheCountries 
{

	public static void main(String[] args) 
	{
		//we are using chrome browser as a web driver here
		WebDriver driver = new ChromeDriver();
		
		//to handle NoSuchElementException
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//to maximize the driver window
		driver.manage().window().maximize();
		
		//to hit the URL
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		//web element of country drop down
		WebElement countriesDD = driver.findElement(By.xpath("//select"));
		
		//to fetch the options from drop down we use Select class and its respective methods
		Select sle = new Select(countriesDD);
		
		//here we are going to print/get all the options fo drop down and it will return a List format
		List<WebElement> getAllCountries = sle.getOptions();
		
		//to print all the countries we are going to use for-each loop here
		for(WebElement i : getAllCountries)
		{
			System.out.println(i.getText());
		}
		
		//to close the driver
		driver.quit();
	}

}
