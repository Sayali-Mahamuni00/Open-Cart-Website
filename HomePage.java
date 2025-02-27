package openCart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccount_Btn;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement register_option;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login_option;
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMyAccountButton() {
		myAccount_Btn.click();
	}
	public void clickOnRegisterOption() {
		register_option.click();
	}
	public void clickOnLoginOption() {
		login_option.click();
	}
	
}
