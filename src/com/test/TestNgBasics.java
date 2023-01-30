package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	//pre-conditions -- starting with @Before
	@BeforeSuite  //1. executed first
	public void Setup(){
		System.out.println("setup system property for chrome");
	}
	@BeforeTest //2. 
	 public void launchBrowser() {
	   System.out.println("Launch Browser");
	}
    @BeforeClass //3
    public void enterURL() {
       System.out.println("Eneter URL");
    }
    
    
    
    /*@Test execute on alphabetical order
     * 
     * @BeforeSuite -- 1
     *@BeforeTest -- 2
     *@BeforeClass--3
     *
     *
     *PAIR1
     * @BeforeMethod 
     * @Test : Google Logo Test
     * @AfterMethod
     * 
     * 
     * PAIR2
     * @BeforeMethod
     * @Test : Google Title Test
     * @AfterMethod
     * 
     * 
     * PAIR3
     * @BeforeMethod
     * @Test : Search Test
     * @AfterMethod
     *@AfterClass
     *@AfterTest
     *
     */
    
    @BeforeMethod //4
    public void Login() {
    	System.out.println("Login Method");
    }

   
    //test cases--starting with test
     @Test //5
    public void googleTitleTest() {
    	System.out.println("Google title test");
    }
     @Test
     public void searchTest() {
    	 System.out.println("search test");
     }
     @Test
     public void googleLogoTest() {
    	 System.out.println("Google Logo Test");
     }
    //post conditions -- starting with @After
    @AfterMethod //6
    public void logout() {
    	System.out.println("Logout from app");
    }

    @AfterClass //7
    public void closeBrowser() {
    	System.out.println("Close the chrome browser");
    }
    @AfterTest //8
    public void deleteCookies() {
    	System.out.println("Delete all cookies");
    }
    
    @AfterSuite //9
    public void generateTestReport() {
    	System.out.println("Generate Test Report");
    }
    
}
