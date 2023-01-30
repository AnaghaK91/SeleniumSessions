package SeleniumSessionsBeginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
						
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait is applicable for all the elements available in the page.
				 
		driver.get("https://www.ebay.com/");	
		
		//driver.findElement(By.xpath("//input[@id='gh-ac' or @aria-label='search for anything']")).sendKeys("Apple");
		
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Apple");
		
		//dynamic id : input
		//id = test_123
		//By.id("test_123")
		//id = test_456
		//id =test_478
		
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("test123");
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("test");
		
		//id = 1234_test_
		//id = 3456_test_
		//id = 4578_test_
		
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test_')]")).sendKeys("test");
		
		//for links : custom xpath
		//advantage : unique, fast, no performance issues
		
		driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab hl-cat-nav__js-show']//a[contains(text(),'Sports')]")).click();
		
	
		
		
		
		
				

	}

}
