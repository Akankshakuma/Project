package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationPopUp_MakeMyTrip {

	public static void main(String[] args) 
	{

		EdgeOptions options = new EdgeOptions();
		options.setCapability("disable-infobars", false);
		options.setCapability("disable-notification", true);
		
		WebDriverManager.edgedriver().setup(); 
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		driver.quit();
		
		

	}

}
