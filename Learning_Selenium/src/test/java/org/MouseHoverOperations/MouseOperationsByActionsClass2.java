package org.MouseHoverOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationsByActionsClass2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.oracle.com/in/");
		
		Actions act = new Actions(driver);
		
		WebElement exploreCloudAppsCTA = driver.findElement(By.xpath("//button[text()= \"Explore cloud apps\"]"));
		act.scrollToElement(exploreCloudAppsCTA).perform();
		act.click(exploreCloudAppsCTA).perform();
		
		//here perform() is a method of Actions class which is used to perform single action
		//where as biuld is also a method of Actions class which is used to perform multiple actions
		//we can use this method in a drag and drop operation by using clickAndHold(source) 
		//then moveToElement(destination), release() and then build() and after that perform()
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

	}

}
