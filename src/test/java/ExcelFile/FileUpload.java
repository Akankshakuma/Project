package ExcelFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		
		driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\Akanksha.R\\Downloads\\Akanksha_Kumari.jpg");
		Thread.sleep(10000);
		//driver.close();

	}

}
