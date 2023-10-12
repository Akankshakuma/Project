package com.basic_pro;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		  
				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
				
				WebElement ele1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));               //relative xpath
				WebElement ele2 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
				
				Actions a = new Actions(driver);
				a.dragAndDrop(ele1, ele2).perform();       

				Thread.sleep(2000); 
					
				driver.close();	

		
/*		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bstackdemo.com");       // using cssSelector has good speed than xpath
		driver.findElement(By.xpath("//select")).click();
		List<WebElement> allOptions = driver.findElement(By.cssSelector("select option"));
		String option = "Highest to Lowest";
		//Iterate list using loop 
		for(int i=0; i<allOptions.size(); i++)
		{
		      if(allOptions.get(i).getText().contains(option))
		      {
		             allOptions.get(i).click();
		             System.out.println("clicked");
		             break;
		      }
		}
*/
	}
}
