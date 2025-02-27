package openCart.testLayer;

import org.testng.annotations.Test;

import openCart.pageLayer.HomePage;
import openCart.pageLayer.LoginPage;
import openCart.testBase.TestBase;

public class LoginPageTest extends TestBase{
	
	@Test
	public void loginWithValidDetails() throws InterruptedException {
		HomePage home_obj=new HomePage(driver);
		home_obj.clickOnMyAccountButton();
		home_obj.clickOnLoginOption();
		
		LoginPage login_obj=new LoginPage(driver);
		login_obj.enterLoginDetails("Saniya@gmail.com", "Saniya@123");
		Thread.sleep(2000);
		
	}
	
	@Test
	public void loginWithInvalidDetails() throws InterruptedException {
		HomePage home_obj=new HomePage(driver);
		home_obj.clickOnMyAccountButton();
		home_obj.clickOnLoginOption();
		
		LoginPage login_obj=new LoginPage(driver);
		login_obj.enterLoginDetails("Virat", "Virat@123");
		Thread.sleep(2000);
		
	}
}
