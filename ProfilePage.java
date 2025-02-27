package openCart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement desktop_option;
	
	@FindBy(xpath="//a[text()='Mac (1)']")
	private WebElement mac_option;
	
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDesktopOption() {
		desktop_option.click();
		mac_option.click();
	}
}
