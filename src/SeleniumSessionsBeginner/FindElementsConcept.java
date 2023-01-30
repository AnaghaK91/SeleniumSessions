package SeleniumSessionsBeginner;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
        WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
						
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait is applicable for all the elements available in the page.
				 
		driver.get("https://www.facebook.com/");	
		
		//get the count of links on the page
		//get the text of each link on the page
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for (int i =0;i<linklist.size();i++) {
			String linkText = linklist.get(i).getText();
			System.out.println(linkText);
			
		}
		
		
		driver.quit();
		
		 

	}

}
