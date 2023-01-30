package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
		
	@Test
	@Parameters({"browser", "url","emailid","password"}) //import from testng
	public void yahooLoginTest(String browser, String url, String emailid, String password) {
		
		if(browser.equals("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
		driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//div[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailid); //enter user name
		driver.findElement(By.xpath("//input[@id='login-signin']")).click(); // click on next button
		driver.findElement(By.xpath("//input[@id='login-passwd']")).clear();
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys(password); //enter password
		driver.findElement(By.xpath("//button[@type='submit']")).click(); // click on next 	
		
			
	}
	
	
	
	
}
