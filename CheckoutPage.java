package openCart.pageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import openCart.utility.ScrollPage;

public class CheckoutPage {
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement checkout_btn;
	
	@FindBy(xpath="//input[@id='input-shipping-firstname']")
	private WebElement checkout_fname;
	
	@FindBy(xpath="//input[@id='input-shipping-lastname']")
	private WebElement checkout_lname;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement checkout_company;
	
	@FindBy(xpath="//input[@name='address_1']")
	private WebElement checkout_address1;
	
	@FindBy(xpath="address_2")
	private WebElement checkout_address2;
	
	@FindBy(xpath="//input[@id='input-shipping-city']")
	private WebElement checkout_city;
	
	@FindBy(xpath="//input[@id='input-shipping-postcode']")
	private WebElement checkout_postcode;
	
	@FindBy(xpath="//select[@id='input-shipping-country']")
	private WebElement checkout_country;
	
	@FindBy(xpath="//*[@id=\"input-shipping-address\"]")
	private WebElement checkout_state;
	
	@FindBy(xpath="//button[@id='button-shipping-address']")
	private WebElement checkout_addressContinueBtn;
	
	@FindBy(xpath="button-shipping-methods")
	private WebElement checkout_shippingMethod;
	
	@FindBy(xpath="(//input[@type='radio'])[3]")
	private WebElement checkout_shippingRadioBtn;
	
	@FindBy(xpath="//button[@id='button-shipping-method']")
	private WebElement checkout_shippingContinueBtn;
	
	@FindBy(xpath="//button[@id='button-payment-methods']")
	private WebElement checkout_Payment;
	
	@FindBy(xpath="(//input[@type='radio'])[4]")
	private WebElement checkout_paymentRadioBtn;
	
	@FindBy(xpath="//button[@id='button-payment-method']")
	private WebElement checkout_PaymentContinueBtn;
	
	@FindBy(xpath="//textarea[@id='input-comment']")
	private WebElement checkout_comment;
	
	@FindBy(xpath="//button[text()='Confirm Order']")
	private WebElement checkout_confirmOrderBtn;
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].disabled = false;", checkout_country);
	}
	
	public void continueToCheckout(String fname,String lname,String company,String address1,String city,String postcode,String country,String state,String comment) throws InterruptedException {
		
		ScrollPage scroll_obj=new ScrollPage();
		scroll_obj.scrollDownPage();
		
		checkout_btn.click();
		checkout_fname.sendKeys(fname);
		checkout_lname.sendKeys(lname);
		checkout_company.sendKeys(company);
		checkout_address1.sendKeys(address1);
		
		scroll_obj.scrollDownCheckoutPage();;
		
		checkout_city.sendKeys(city);
		checkout_postcode.sendKeys(postcode);
		
		Select select_country=new Select(checkout_country);
		select_country.selectByVisibleText(country);
		
//		Select select_state=new Select(checkout_country);
//		select_state.selectByValue(state);
		
		
		
		
		if (checkout_country.isEnabled()) {
		    Select select = new Select(checkout_country);
		    select.selectByVisibleText(state);
		} else {
		    System.out.println("Dropdown is disabled. Cannot select option.");
		    // Handle the case where the dropdown is still disabled.
		}
		
		checkout_addressContinueBtn.click();
		Thread.sleep(2000);
		
		scroll_obj.scrollUpPage();
		
		checkout_shippingMethod.click();
		checkout_shippingRadioBtn.click();
		checkout_shippingContinueBtn.click();
		checkout_Payment.click();
		checkout_paymentRadioBtn.click();
		checkout_PaymentContinueBtn.click();
		
		scroll_obj.scrollDownCheckoutPage();;
		
		checkout_comment.sendKeys(comment);
		checkout_confirmOrderBtn.click();
	}
	
}
