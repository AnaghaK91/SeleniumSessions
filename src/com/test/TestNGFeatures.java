package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {

	
	@Test
	public void loginTest() {
     System.out.println("Login Test");
    // int i = 9/0; // this test will fail since 9/0 is not valid and 2nd, 3rd, 4th test will be skipped
	}
	
	@Test(dependsOnMethods = "loginTest") // will be skipped since depends on login test which is already failed.
	  public void homePageTest() {
	  System.out.println("home page Test is totally dependant on login test");
	}	
	@Test(dependsOnMethods = "loginTest")
	  public void searchPageTest() {
	  System.out.println("serach page Test");
	}
	@Test(dependsOnMethods = "loginTest")
	  public void RegPageTest() {
	  System.out.println("Register page Test");
	}

	
}
