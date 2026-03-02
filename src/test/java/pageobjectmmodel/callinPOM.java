package pageobjectmmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class callinPOM {
@Test
	public static void executeMethod() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//creating the object
		Login_ohrm lin=new Login_ohrm(driver);
		lin.url();
		lin.enterUserName("Admin");
		lin.enterPassword("admin123");
		lin.clickOnLoginBTN();
		
		logout_orhm lout=new logout_orhm(driver);
		lout.clickOnProfilel();
		lout.clickOnLogout();
	}

}
