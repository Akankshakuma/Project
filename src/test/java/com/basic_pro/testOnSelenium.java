package com.basic_pro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testOnSelenium {

	public static void main(String[] args) throws InterruptedException {
		
	
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.calculator.net/interest-calculator.html");
		
	//with select
	    //Select option = new Select(driver.findElement(By.id("ccompound")));
	    //option.selectByValue("daily");
		
		
	//without select using click()
		driver.findElement(By.xpath("//select[@id='ccompound']/option[@value='biweekly']")).click(); 
		
		
	// without select using sendKeys()
		//driver.findElement(By.id("ccompound")).sendKeys("biweekly"); 
	
	// without select using for-loop
	/*	driver.findElement(By.xpath("//select")).click();
		List<WebElement> allOptions = driver.findElements(By.cssSelector("select option"));
				
		String option = "biweekly";
		//Iterate list using loop 
		for(int i=0; i<allOptions.size(); i++)
		{
		      if(allOptions.get(i).getText().contains(option))
		      {
		             allOptions.get(i).click();
		             System.out.println(option + " is clicked");
		             break;
		      }
		}*/
		
		Thread.sleep(3000);
		driver.close();

		
			 //Get list of web-elements with tagName  - a
			 //Traversing through the list and printing its text along with link address
    
		
/**
  * get all links available on google page
 */
/*
 * driver.get("https://google.com");
 * 
 * List<WebElement> allLinks = driver.findElements(By.tagName("a"));
 * 
 * for(WebElement link:allLinks){ System.out.println(link.getText() + " - " +
 * link.getAttribute("href")); }
 * 
 * driver.close();
 */
		
	}

}
