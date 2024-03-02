package org.FileUploading_using_Robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://app.recruitcrm.io/v1/login");
		
		Thread.sleep(5000);
//		Enter Username | Password & Click on LoginCTA
		driver.findElement(By.id("sTestEmail")).sendKeys("admin@careerswitchacademy.in");
		driver.findElement(By.id("sTestPassword")).sendKeys("123456");	
		driver.findElement(By.id("sTestLoginBtn")).click();
		Thread.sleep(5000);
	
//		Click on Profile Icon and My Profile
		driver.findElement(By.id("sTest-dpLinkInAppBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("sTest-profileInAppBtn")).click();
		
//		Click on FileUpload Icon
		Thread.sleep(5000);
		driver.findElement(By.className("details-page-profile")).click();
		
		Thread.sleep(5000);
		StringSelection ss = new StringSelection("C:\\Users\\KRUSHNA\\Desktop\\images.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		
		Robot r = new Robot();
		
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
