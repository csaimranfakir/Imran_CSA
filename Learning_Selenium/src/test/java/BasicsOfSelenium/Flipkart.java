package BasicsOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.flipkart.com/");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		searchBox.sendKeys("Laptops");
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		searchButton.click();
		
		driver.quit();
		
	}

}
