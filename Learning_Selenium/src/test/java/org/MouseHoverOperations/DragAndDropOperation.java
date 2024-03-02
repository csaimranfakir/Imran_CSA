package org.MouseHoverOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/droppable");

		Actions act = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		act
		.clickAndHold(source) //web element of draggable
		.moveToElement(destination) //web element of dropable
		.release() //to release the source on destination
		.build() //it is a method of actions class and which use to perform multiple actions
		.perform(); //it is also a method of a actions class which is used to perform a sinle action

//		act.dragAndDrop(source, destination).perform();

		Thread.sleep(3000);

		driver.quit();
	}

}
