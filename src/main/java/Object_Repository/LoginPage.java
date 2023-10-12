package Object_Repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	//Declaration
	
	@FindBy(id="username")
	private WebElement userNameEdt;
	
	@FindBy(name="pwd")
	private WebElement passWordEdt;
	
	@FindBy(xpath= "//div[text()='Login']")
	private WebElement loginBtn;
	
	
	

}
