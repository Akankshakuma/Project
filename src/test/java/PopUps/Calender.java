package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.yatra.com/");
	
		driver.findElement(By.xpath("//*[@id =\"BE_flight_origin_date\"]")).click();  //"//label[@for ='BE_flight_origin_city']"
		driver.findElement(By.id("16/10/2023")).click(); //By.xpath("//td[@id='16/10/2023']")

		Thread.sleep(3000);
		driver.close();
	}

}
