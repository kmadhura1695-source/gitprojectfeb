package pageobjectmmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class callinPOMPagefact {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//creating the object
		LoginORHM_pagefact lin=new LoginORHM_pagefact(driver);
		lin.url();
		lin.enterUserName("Admin");
		lin.enterPassword("admin123");
		lin.clickOnLoginBTN();
		
		logout_orhm lout=new logout_orhm(driver);
		lout.clickOnProfilel();
		lout.clickOnLogout();
	



	}

}
