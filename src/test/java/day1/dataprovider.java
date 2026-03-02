package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
@DataProvider(name="dataSet", parallel=false)
public Object[][] mobileDataSet()
{
	Object[][] data=new Object[3][2];
	data[0][0]="iPhone";
	data[0][1]="17";
	
	data[1][0]="OnePlus";
	data[1][1]="13";
	
	data[2][0]="Oppo";
	data[2][1]="reno10";
	
	
	return data;
}
	@Test(dataProvider="dataSet")
	public void searchmobile(String brand, String model)
	{
		try {
		WebElement popUp=driver.findElement(By.xpath("//div[@class=\"q7ywiQ\"]/child::span"));
		if(popUp.isDisplayed())
		{
			popUp.click();
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		WebElement searchbox=driver.findElement(By.name("q"));
		
		searchbox.sendKeys(brand+" "+model);
		searchbox.sendKeys(Keys.ENTER);
		driver.navigate().back();
		}
}
