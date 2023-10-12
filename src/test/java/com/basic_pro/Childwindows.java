package com.basic_pro;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Childwindows 
{

	public static void main(String[] args) 
	{
	    	//WebDriver driver = new EdgeDriver();
			WebDriver driver = WebDriverManager.edgedriver().create();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/browser-windows");
			driver.findElement(By.id("windowButton")).click();
			String mainWindow = driver.getWindowHandle();
			Set<String> s1 =driver.getWindowHandles();
			Iterator<String> i1 = s1.iterator();

			while(i1.hasNext())
			{
			String childWindow = i1.next();
				 if(!mainWindow.equalsIgnoreCase(childWindow))
				 {
					 driver.switchTo().window(childWindow);
					 WebElement text = driver.findElement(By.id("sampleHeading"));
					 System.out.println("Heading of child window is " + text.getText());
					 driver.close();
					 System.out.println("child window closed");
				 }

			}
			 driver.switchTo().window(mainWindow);
		        driver.quit();
		        
/*		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();// to maximize the browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/");
		
		
		//to handle all new opened window
		String mainwindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		
		
		while(i1.hasNext())
		{
		   String childWindow = i1.next();
		   if(!mainwindow.equalsIgnoreCase(childWindow))
		   {
		         driver.switchTo().window(childWindow);
		          WebElement text = driver.findElement(By.id("sampleHeading"));
		          System.out.println("Heading of childwindow is: "+ text.getText());
		          driver.close();
		    }
		   
		}
		driver.quit();
		
		
	

*/		

	}

}
