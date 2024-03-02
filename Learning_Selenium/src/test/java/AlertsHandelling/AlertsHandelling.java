package AlertsHandelling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsHandelling 
{

	public static void main(String[] args) 
	{
		// Alert is something which is created by JavaScript and not with HTML, and because of this we can't inspect them.
		//so to handle alerts first we have to switch our driver to alert tab
		//and by using the methods which are present in the Alert interface we can perform further actions on alerts
		
		//so we have various methods in alert interface
		/*
		 .accept() = which is used to perform all the positive operations like OK, YES, CONFIRM, DONE etc
		 .dismiss() = which is used to perform all the negative operations like REJECT, CANCEL etc
		 .sendKeys() = which is used to send input in PROMPT ALERT
		 .getText() = which is used to verify the text of alerts
		 */
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("start-maximized");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/alerts");
		
		WebElement timerAlertCTA = driver.findElement(By.id("timerAlertButton"));
		timerAlertCTA.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].value = 'Hello there'", timerAlertCTA);
	    jse.executeScript("arguments[0].scrollIntoView()", timerAlertCTA);




	}

}
