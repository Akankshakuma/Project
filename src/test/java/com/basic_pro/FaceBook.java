package com.basic_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FaceBook {
	public static void main(String[] args) throws InterruptedException 	
	{
		//WebDriver driver = WebDriverManager.chromedriver().create();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");	
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.findElement(By.id("Mobile Number")).sendKeys("9876543210");
		
/*		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Akanksha");
		driver.findElement(By.id("lastName")).sendKeys("Kumari");
		driver.findElement(By.id("userEmail")).sendKeys("Akankshakumari@gmail.com");
				
		driver.findElement(By.id("userNumber")).sendKeys("986554321");
		//driver.findElement(By.xpath("//input[@id='gender-radio-2']")).click();
	/*	WebElement ele1 = driver.findElement(By.id("gender-radio-1"));
		for(int i=0; i<1; i++)
		{
			ele1.click();
			System.out.println(ele1.isSelected());
		}
*/
		Thread.sleep(4000);
		driver.quit();
	}

}



