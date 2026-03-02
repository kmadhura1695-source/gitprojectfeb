package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OHRMtestinglogin {
WebDriver driver;

	@BeforeSuite
	public void setUp()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		
	}
	
	@Test(priority=1)
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.linkText("submit")).click();
		
	}

	@Test(priority=2)
	public void verify()
	{
		String dash=driver.findElement(By.xpath("//div[@id='app']/descendant::h6")).getText();
		/*if(dash.equals("Dashboard"))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("testcase failed");
		}*/
		Assert.assertEquals(dash, "Dashboard");
}
	
	@Test(priority=3)
	public void logout()
	{
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
@AfterSuite
public void teardown()
{
	driver.quit();
}

}

