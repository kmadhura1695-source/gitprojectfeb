package pageobjectmmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logout_orhm {

	WebDriver driver;


	public logout_orhm(WebDriver driver)
	{
		this.driver=driver;
	}


//repository
	By profile=By.className("oxd-userdropdown-tab");
	By logout=By.linkText("Logout");
	
	public void clickOnProfilel()
	{
		driver.findElement(profile).click();
	}
	
	public void clickOnLogout()
	{
		driver.findElement(logout);
		
	}
}

