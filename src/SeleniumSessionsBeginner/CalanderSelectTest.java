package SeleniumSessionsBeginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalanderSelectTest {

	public static void main(String[] args) throws InterruptedException {


		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	   	 driver.manage().deleteAllCookies();
	   	   
	   	 driver.get("https://freecrm.com/");
		   
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait is applicable for all the elements available in the page
		   
		 driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.name("email")).sendKeys("anagha.k91@gmail.com");
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bhadran$2021");
		 driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		 Thread.sleep(3000);
		
		 Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(By.xpath("//i[@class='calendar icon']"))).build().perform();
		 driver.findElement(By.xpath("//span[@class='item-text'][contains(text(),'Calendar')]")).click();
		 driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		 
		 
		//body/div[@id='ui']/div[@class='ui fluid container']/div[@class='ui fluid container']/div[@id='main-content']/div[contains(@class,'ui fluid container')]/div[@class='ui fluid container main-content']/form[@class='ui form segment custom-form-container']/div[@class='two fields']/div[1]/div[1]/div[1]/div[1]/input[1]


		

	}

}
