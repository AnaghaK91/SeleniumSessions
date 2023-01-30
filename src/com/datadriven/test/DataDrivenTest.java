package com.datadriven.test;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) throws InterruptedException {

		
		Xls_Reader reader =  new Xls_Reader("C:\\Users\\Anagha K\\eclipse-workspace\\SeleniumSessions\\src\\com\\testdata\\FlipkartTestdata.xlsx");
		
		String Name = reader.getCellData("RegTestData", "name", 2);	
		String Mob = reader.getCellData("RegTestData", "mob", 2);
		String Pincode = reader.getCellData("RegTestData", "pincode", 2);
		String Locality = reader.getCellData("RegTestData", "locality", 2);
		String State = reader.getCellData("RegTestData", "state", 2);
		String Address = reader.getCellData("RegTestData", "address", 2);
		String Home_Work = reader.getCellData("RegTestData", "home/work", 2);


		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.flipkart.com/"); // Enter url
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//a[text()='Login']")).click();
			
		driver.findElement(By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU']")).clear();
		
		driver.findElement(By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU']")).sendKeys("8095854319");
		
		driver.findElement(By.xpath("//input[@type='password' and @class='_2IX_2- _3mctLh VJZDxU']")).clear();
		
		driver.findElement(By.xpath("//input[@type='password' and @class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("L0ndonbridge");
		
		driver.findElement(By.xpath("//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		Thread.sleep(3000);

		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[@class='exehdJ']"))).build().perform();
		
		driver.findElement(By.xpath("//div[contains(text(),'My Profile')]")).click();
		
		action.moveToElement(driver.findElement(By.xpath("//input[@type='text' and @name='firstName']"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='NS64GK' and contains(text(),'Manage Addresses')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='_1QhEVk']")).click();
		
		driver.findElement(By.xpath("//input[@type='text' and @name='name']")).sendKeys(Name);
		
		driver.findElement(By.xpath("//input[@type='text' and @name='phone']")).sendKeys(Mob);
		
		driver.findElement(By.xpath("//input[@type='text' and @name='pincode']")).sendKeys(Pincode);
		
		driver.findElement(By.xpath("//textarea[@class='_1sQQBU _1w3ZZo _1TO48q' and @name='addressLine1']")).sendKeys(Address);
		
		driver.findElement(By.xpath("//input[@type='text' and @name='addressLine2']")).sendKeys(Locality);
		
		Select select = new Select(driver.findElement(By.xpath("//select[@name='state']")));
		
		select.selectByVisibleText(State);
		
		if(Home_Work == "home") {
			driver.findElement(By.xpath("//label[@for='HOME'] //div[@class='_1XFPmK']")).click();
		}
		else if(Home_Work=="work") {
			driver.findElement(By.xpath("//label[@for='WORK'] //div[@class='_1XFPmK']")).click();
		}
		
		driver.findElement(By.xpath("//button[@type='button' and contains(text(),'Save')]")).click();
		
		Thread.sleep(2000);	
		
		action.moveToElement(driver.findElement(By.xpath("//div[@class='exehdJ']"))).build().perform();
		
		driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).click();
		
		driver.quit();
		
	}

}
