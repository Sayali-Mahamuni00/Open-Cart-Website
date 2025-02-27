package openCart.testLayer;

import org.testng.annotations.Test;

import openCart.pageLayer.CatalogPage;
import openCart.pageLayer.CheckoutPage;
import openCart.pageLayer.HomePage;
import openCart.pageLayer.ProductPage;
import openCart.pageLayer.ProfilePage;
import openCart.testBase.TestBase;

public class ProductPageTest extends TestBase{
	@Test
	public void VerifyProductBuyingWithValiddetails() throws InterruptedException {
		HomePage home_obj=new HomePage(driver);
		home_obj.clickOnMyAccountButton();
		home_obj.clickOnLoginOption();
		
		LoginPageTest login_obj=new LoginPageTest();
		login_obj.loginWithValidDetails();
		
		ProfilePage profile_obj=new ProfilePage(driver);
		profile_obj.clickOnDesktopOption();
		
		CatalogPage catalog_obj=new CatalogPage(driver);
		catalog_obj.clickOnProduct();
		
		ProductPage product_obj=new ProductPage(driver);
		product_obj.addToCartProduct("1");
		
		CheckoutPage checkout_obj=new CheckoutPage(driver);
		checkout_obj.continueToCheckout("Saniya", "Mirjha", "one8", "Bandra", "Mumbai", "419012", "India", "Maharashtra", "Good Product");
		
		Thread.sleep(4000);
	}
}
//its a defect