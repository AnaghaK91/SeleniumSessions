package SeleniumSessionsBeginner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//Launch FF
		//gickodriver : not required since firefox driver jar file already included in the reference libraries.
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Anagha K\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		
	/*	WebDriver driver1 = new FirefoxDriver(); // Launch FF
		driver1.get("http://www.google.com"); // Enter url */
		
	  //2. Launch Chrome browser
	 //System.setProperty("webdriver.chrome.driver","C:\\Users\\Anagha K\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		
      WebDriver driver2 = new ChromeDriver();// Launch chrome
      driver2.get("http://www.google.com"); // Enter url
      String title =   driver2.getTitle();
      System.out.println(title);
      
      //Validation point : comparing the actual Vs Expected result
      if(title.equals("google")) {
    	  System.out.println("correct title");
      }
      else {
    	  System.out.println("incorrect title");
      }
      
      System.out.println(driver2.getCurrentUrl());
     // System.out.println(driver2.getPageSource()); // to get the page source code
      driver2.quit(); // to close/quit the browser;
     	
	
	}

	
}
