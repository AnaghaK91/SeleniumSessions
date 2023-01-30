package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

public class ParameterizeTest {

	public static void main(String[] args) throws InterruptedException {

		Xls_Reader reader =  new Xls_Reader("C:\\Users\\Anagha K\\eclipse-workspace\\SeleniumSessions\\src\\com\\testdata\\FlipkartTestdata.xlsx");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.flipkart.com/"); // Enter url
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		
		int rowCount = reader.getRowCount("RegTestData");
		
		
		reader.addColumn("RegTestData", "Status"); // creating status column in the excel sheet.
		
		
		for(int rowNum=2;rowNum<=rowCount;rowNum++) {
			
			String name = reader.getCellData("RegTestData", "name", rowNum);
			String mob = reader.getCellData("RegTestData", "mob", rowNum);
			String pincode = reader.getCellData("RegTestData", "pincode", rowNum);
			String locality = reader.getCellData("RegTestData", "locality", rowNum);
			String state = reader.getCellData("RegTestData", "state", rowNum);
			String address = reader.getCellData("RegTestData", "address", rowNum);
			String home_work = reader.getCellData("RegTestData", "home/work", rowNum);


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
		
		action.moveToElement(driver.findElement(By.xpath("//div[@class='exehdJ']"))).build().perform();
		
		driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).click();
		
		reader.setCellData("RegTestData", "Status", rowNum, "pass"); //write the data into cell
		
		
	
		
		}	

	}

}
