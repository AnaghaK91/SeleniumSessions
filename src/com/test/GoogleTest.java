package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	
	WebDriver driver;
	
	@BeforeMethod
	public void setUP() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		
	}
	@Test(priority=1,groups ="Title")
	public void GoogleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2,groups = "Logo")
	public void GooleLogotest() {
		boolean b = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority=3,groups = "Link Test")
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(b);
	}
	@Test(priority=4,groups = "Test")
	public void Test1() {
		System.out.println("Test1");
	}
	@Test(priority=5,groups = "Test")
	public void Test2() {
		System.out.println("Test2");
	}
	@Test(priority=6,groups = "Test")
	public void test3() {
		System.out.println("Test3");
	}
	@Test(priority=7,groups="Test")
	public void test4() {
		System.out.println("Test4");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
}
