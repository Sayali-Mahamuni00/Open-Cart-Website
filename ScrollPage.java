package openCart.utility;

import org.openqa.selenium.JavascriptExecutor;

import openCart.testBase.TestBase;

public class ScrollPage extends TestBase{
	JavascriptExecutor js=((JavascriptExecutor)driver);
	public void scrollDownPage() throws InterruptedException {
		js.executeScript("scroll(0,1000)");//Vertical Down
		Thread.sleep(2000);
	}
	public void scrollUpPage() throws InterruptedException {
		js.executeScript("scroll(700,0)");//Vertical Down
		Thread.sleep(2000);
	}
	
	public void scrollDownCheckoutPage() throws InterruptedException {
		js.executeScript("scroll(0,300)");//Vertical Down
		Thread.sleep(2000);
	}
	public void scrollUpCheckoutPage() throws InterruptedException {
		js.executeScript("scroll(700,0)");//Vertical Down
		Thread.sleep(2000);
	}

}
