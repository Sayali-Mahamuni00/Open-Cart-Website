package openCart.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	public static WebDriver driver;
	@BeforeTest
	public void stepsBeforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	@AfterTest
	public void stepsAfterTest() {
		driver.quit();
	}
	

}
