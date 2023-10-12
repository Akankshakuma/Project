package com.basic_pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameConcept {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
		//switch to frame by framenumber
		driver.switchTo().frame(0);
		
		//switch to frame by name
		// create webelement for the frame as name
		driver.switchTo().frame("iframe1");
		
		//switch to frame by frame ID
		driver.switchTo().frame("If1");
		driver.quit();
		
		//switch back to main window
		driver.switchTo().defaultContent();
	}

}
