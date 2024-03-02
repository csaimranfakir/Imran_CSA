package AlertsHandelling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class PromptAlert 
{

	public static void main(String[] args) throws InterruptedException 
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
		
		EdgeOptions co = new EdgeOptions();
		co.addArguments("start-maximized");
		co.addArguments("disable-notifications");

		WebDriver driver = new EdgeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/alerts");

		WebElement promptCTA = driver.findElement(By.id("promtButton"));
		promptCTA.click();

		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("Hello there!!!");
		
		alt.accept();
		System.out.println(alt.getText());
		Thread.sleep(3000);
		driver.quit();




	}

}
