package org.MouseHoverOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationsByActionsClass 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");
		
		ChromeDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		
		WebElement signIn = driver.findElement(By.xpath("//a[@data-csa-c-slot-id=\"nav-link-accountList\"]"));
		act.moveToElement(signIn).perform();
		
		WebElement babyListLink = driver.findElement(By.xpath("//span[text() = \"Baby Wishlist\"]"));
		act.click(babyListLink).perform();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
