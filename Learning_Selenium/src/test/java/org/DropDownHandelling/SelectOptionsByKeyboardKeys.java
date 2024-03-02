package org.DropDownHandelling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectOptionsByKeyboardKeys 
{

	public static void main(String[] args) throws InterruptedException
	{
		//We will use a chrome driver here from a WebDriver Interface
		WebDriver driver = new ChromeDriver();
		
		//To handle NoSuchElementException 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//to maximize the driver window
		driver.manage().window().maximize();
		
		//to hit the URL
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		//web element of countries drop down
		WebElement countriesDD = driver.findElement(By.xpath("//select"));
		//to click on dropdown
		countriesDD.click();
		
		//now to do operation by using keyboard keys we use sendKeys method and in that we use Keys class and
		//their respective options like ARROW_DOWN, ENTER etc.
		
		//so we are going to select 3rd option from the available options so we will use ARROW_DOWN 2 times
		Thread.sleep(2000);
		countriesDD.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		countriesDD.sendKeys(Keys.ARROW_DOWN);
		
		//and to select we need to press ENTER key so we will use ENTER key here
		Thread.sleep(2000);
		countriesDD.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		//to close the driver
		driver.quit();

	}

}
