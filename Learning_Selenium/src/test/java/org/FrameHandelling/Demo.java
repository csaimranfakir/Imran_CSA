package org.FrameHandelling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");
		
		WebElement input = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Thread.sleep(3000);
		input.sendKeys("CSA-2200");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		WebElement home = driver.findElement(By.xpath("//a[text() = 'Home']"));
		Thread.sleep(3000);
		home.click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
