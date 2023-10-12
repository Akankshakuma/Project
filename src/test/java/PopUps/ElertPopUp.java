package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElertPopUp {

//get text from popup, accept popup, dissmiss popup
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		//Get text from conformation pop-ups
		String a2 = al.getText();
		System.out.println(a2);
		
		
		//Accept the popup
/*		 al.accept(); 
		 System.out.println("PopUp accepted"); 
		 Thread.sleep(3000);
*/
		
		//Dismiss the popup		
/*		 al.dismiss(); 
		 System.out.println("PopUp dismissed");
*/	
		
		
		driver.quit();
	}

}
