package openCart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage {
	
	@FindBy(xpath="(//img[@class='img-fluid'])[3]")
	private WebElement mac_img;
	
	public CatalogPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProduct() {
		mac_img.click();
	}
}
