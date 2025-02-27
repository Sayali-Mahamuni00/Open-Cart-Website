package openCart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends RegisterPage{
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement login_submitBtn;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterLoginDetails(String email,String pass) {
		super.email_address.sendKeys(email);
		super.password.sendKeys(pass);
		login_submitBtn.click();
	}
	
	
}
