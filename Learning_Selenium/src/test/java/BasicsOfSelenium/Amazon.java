package BasicsOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon 
{

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		WebElement searchField = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		searchField.sendKeys("Mobiles");
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		searchButton.click();
		
		driver.quit();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(searchButton));
		
		
	}

}
