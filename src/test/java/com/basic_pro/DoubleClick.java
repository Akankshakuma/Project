package com.basic_pro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException 
	{
//S1: Launch the browser
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
	//S2: Maximize the browser
		driver.manage().window().maximize();
		
	//S3: USE Implicit wait method
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//S4: Launch application using URL
		driver.get("https://www.amazon.in/");
		
	//S5: Identify the address of Search text field
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		Thread.sleep(2000); 
		
	//S6: 	doubleclick Action
		WebElement doubleclick = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions a = new Actions(driver);
		a.doubleClick(doubleclick).perform();
		Thread.sleep(4000); 
		
	//7: close current browser	
		driver.close();
		

	}

}
