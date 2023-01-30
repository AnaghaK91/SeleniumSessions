package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.test.utility.TestUtil;

public class FlipcartRegistrationTest {

	WebDriver driver ;
	Actions action ;
	
	@BeforeClass
	public void startUP() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.flipkart.com/");
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Thread.sleep(3000);
	}
	
	
	@BeforeMethod
	public void login() throws InterruptedException {
		
		
		 driver.findElement(By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU']")).clear();
			
		 driver.findElement(By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU']")).sendKeys("8095854319");
		
		driver.findElement(By.xpath("//input[@type='password' and @class='_2IX_2- _3mctLh VJZDxU']")).clear();
		
		 driver.findElement(By.xpath("//input[@type='password' and @class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("L0ndonbridge");
		
		 driver.findElement(By.xpath("//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		 Thread.sleep(3000);
		 
		 
	}
	
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
	ArrayList<Object[]> testdata = TestUtil.getDataFromExcel();
	return testdata.iterator();
	
		
	}
	
	
	
	@Test(dataProvider="getTestData" )
	public void FlipkartRegTest(String name, String mob, String pincode, String address, String locality, String home_work, String state) throws InterruptedException {
		
		
	   action = new Actions(driver);

	   action.moveToElement(driver.findElement(By.xpath("//div[@class='exehdJ']"))).build().perform();
	
	   driver.findElement(By.xpath("//div[contains(text(),'My Profile')]")).click();
	
	   action.moveToElement(driver.findElement(By.xpath("//input[@type='text' and @name='firstName']"))).build().perform();
	
	   Thread.sleep(2000);
	
	   driver.findElement(By.xpath("//div[@class='NS64GK' and contains(text(),'Manage Addresses')]")).click();
	
	   Thread.sleep(2000);
	
	   driver.findElement(By.xpath("//div[@class='_1QhEVk']")).click();
	
	   driver.findElement(By.xpath("//input[@type='text' and @name='name']")).sendKeys(name);
	
	   driver.findElement(By.xpath("//input[@type='text' and @name='phone']")).sendKeys(mob);
	
	   driver.findElement(By.xpath("//input[@type='text' and @name='pincode']")).sendKeys(pincode);
	
	   driver.findElement(By.xpath("//textarea[@class='_1sQQBU _1w3ZZo _1TO48q' and @name='addressLine1']")).sendKeys(address);
	
	   driver.findElement(By.xpath("//input[@type='text' and @name='addressLine2']")).sendKeys(locality);
	
	  Select select = new Select(driver.findElement(By.xpath("//select[@name='state']")));
	
	  select.selectByVisibleText(state);
	
	if(home_work == "home") {
		driver.findElement(By.xpath("//label[@for='HOME'] //div[@class='_1XFPmK']")).click();
	}
	else if(home_work=="work") {
		driver.findElement(By.xpath("//label[@for='WORK'] //div[@class='_1XFPmK']")).click();
	}
	
	driver.findElement(By.xpath("//button[@type='button' and contains(text(),'Save')]")).click();
	
	Thread.sleep(2000);	
		
	}

	
	@AfterMethod
	public void logOut() {
		
		action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//div[@class='exehdJ']"))).build().perform();
		
		driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).click();
		
	
	}
	
	@AfterClass
	public void tearBrowser() {
		driver.quit();
	}

	
	
	
}
