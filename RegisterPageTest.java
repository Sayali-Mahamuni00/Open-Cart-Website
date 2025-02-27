package openCart.testLayer;

import org.testng.annotations.Test;

import openCart.pageLayer.HomePage;
import openCart.pageLayer.RegisterPage;
import openCart.testBase.TestBase;

public class RegisterPageTest extends TestBase{
	@Test
	public void VerifyRegistrationWithValidDetails() throws InterruptedException {
		HomePage home_obj=new HomePage(driver);
		home_obj.clickOnMyAccountButton();
		home_obj.clickOnRegisterOption();
		
		RegisterPage register_obj=new RegisterPage(driver);
		register_obj.enterRegistrationDetails("Virat", "Kohli", "Virat@gmail.com", "Virat@123");
		Thread.sleep(2000);
	}
	
	@Test
	public void VerifyRegistrationWithInValidDetails() throws InterruptedException {
		HomePage home_obj=new HomePage(driver);
		home_obj.clickOnMyAccountButton();
		home_obj.clickOnRegisterOption();
		
		RegisterPage register_obj=new RegisterPage(driver);
		register_obj.enterRegistrationDetails("Virat", "Kohli", "Virat@gmail", "Virat@123");
		Thread.sleep(2000);
	}
	
	@Test
	public void VerifyRegistrationWithDuplicateDetails() throws InterruptedException {
		HomePage home_obj=new HomePage(driver);
		home_obj.clickOnMyAccountButton();
		home_obj.clickOnRegisterOption();
		
		RegisterPage register_obj=new RegisterPage(driver);
		register_obj.enterRegistrationDetails("Virat", "Kohli", "Virat@gmail.com", "Virat@123");
		Thread.sleep(2000);
	}
}
