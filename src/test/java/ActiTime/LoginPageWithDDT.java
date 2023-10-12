package ActiTime;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageWithDDT {

	@Test
	//public static void main(String[] args) throws  InterruptedException, IOException 
	public void loginToAppTest() throws IOException, InterruptedException
	{
		//Step1: Read the common data from property files
        FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\CommonData.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
		WebDriver driver = null;
		if(BROWSER.equalsIgnoreCase("Edge"))
		{
			driver = WebDriverManager.edgedriver().create();
			System.out.println("Edge browser launced");
		}
		else if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			driver = WebDriverManager.chromedriver().create();
			System.out.println("Chrome browser launced");
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
		{
			driver = WebDriverManager.firefoxdriver().create();
			System.out.println("Firefox browser launced");
		}
		else
		{
			System.out.println("Invalid browser launced");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();  
		
		driver.findElement(By.xpath(""));
		
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 System.out.println("LoggedOut successfully"); 
		 Thread.sleep(3000);
		 driver.quit();
		
		
		
		
	}

}
