package com.basic_pro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

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
					
			//S5: 	RightClick Action
				WebElement right = driver.findElement(By.id("twotabsearchtextbox"));      //.getAttribute("value");
				
				Actions a = new Actions(driver);
				a.contextClick(right).perform();
				
				Thread.sleep(4000); 
				
				
				/*//driver button
				System.out.println("The o/p of disabled button is: "+);
				driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();

				driver.findElement(By.id("twotabsearchtextbox")).isEnabled();

				driver.findElement(By.id("twotabsearchtextbox")).isSelected(); 
				*/
				
				
			//7: close current browser	
				driver.close();
				
		
	}

}
