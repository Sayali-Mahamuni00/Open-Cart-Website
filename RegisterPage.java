package openCart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import openCart.utility.ScrollPage;

public class RegisterPage {
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement firstName;
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lastName;
	@FindBy(xpath="//input[@id='input-email']")
	public WebElement email_address;
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	@FindBy(xpath="//input[@id='input-newsletter']")
	private WebElement subscribe_toggleBtn;
	@FindBy(xpath="(//input[@class='form-check-input'])[2]")
	private WebElement policy_toggleBtn;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continue_btn;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterRegistrationDetails(String fName,String lName,String email,String pass) throws InterruptedException {
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		email_address.sendKeys(email);
		password.sendKeys(pass);
		
		ScrollPage scroll_obj=new ScrollPage();
		scroll_obj.scrollDownPage();
		
		subscribe_toggleBtn.click();
		policy_toggleBtn.click();
		continue_btn.click();
		
		scroll_obj.scrollUpPage();
	}
}
