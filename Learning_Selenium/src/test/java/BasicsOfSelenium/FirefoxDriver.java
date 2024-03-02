package BasicsOfSelenium;

import org.openqa.selenium.WebDriver;

public class FirefoxDriver 
{

	public static void main(String[] args) 
	{
		//first we will use a WebDriver as FirefoxDriver which means webpage will be open in Firefox browser
		WebDriver driver = (WebDriver) new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new EdgeDriver();

	}

}
