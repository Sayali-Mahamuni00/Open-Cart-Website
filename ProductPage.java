package openCart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	@FindBy(xpath="//input[@name='quantity']")
	private WebElement quality_option;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement addToCart_Btn;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement cart_option;
	
	@FindBy(xpath="//*[@id=\"header-cart\"]/div/ul/li/div/p/a[1]/strong/i")
	private WebElement viewCart_option;
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addToCartProduct(String quantity) throws InterruptedException {
		quality_option.clear();
		quality_option.sendKeys(quantity);
		addToCart_Btn.click();
		Thread.sleep(5000);
		cart_option.click();
		viewCart_option.click();
	}
}
