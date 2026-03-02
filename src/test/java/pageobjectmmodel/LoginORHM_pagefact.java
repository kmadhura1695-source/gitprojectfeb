package pageobjectmmodel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginORHM_pagefact {
	WebDriver driver;
	
	public LoginORHM_pagefact(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}

	
	//repository

	@FindBy(name= "username") WebElement userNM;
	@FindBy(name="password")WebElement pass;
	@FindBy(xpath="//button[@type='submit']")WebElement login;
	

	public void url()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}

	public void enterUserName(String un)
	{
	userNM.sendKeys("Admin");
		
	}
	public void enterPassword(String pw)
	{
		pass.sendKeys("admin123");
		
	}
	public void clickOnLoginBTN() {
	login.click();
	}
}
