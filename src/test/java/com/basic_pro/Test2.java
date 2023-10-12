package com.basic_pro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) throws InterruptedException  
	{
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();//launch the browser
		driver.manage().window().maximize();// to maximize the browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //driver.manage().window().minimize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		driver.get("https://www.nykaa.com/");
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();		
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
//amazon->nykaa->amazon->nykaa->flipkart->nykaa	

	}

}
