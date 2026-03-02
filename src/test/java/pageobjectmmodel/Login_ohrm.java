package pageobjectmmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_ohrm {
	WebDriver driver;
	
public Login_ohrm(WebDriver driver)
{
	this.driver=driver;
}

//repository

By userNM=By.name("username");
By pass=By.name("password");
By login=By.xpath("//button[@type='submit']");

public void url()
{
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
}

public void enterUserName(String un)
{
	driver.findElement(userNM).sendKeys("Admin");
	
}
public void enterPassword(String pw)
{
	driver.findElement(pass).sendKeys("admin123");
	
}
public void clickOnLoginBTN() {
driver.findElement(login).click();
}
}
