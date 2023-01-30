package SeleniumSessionsBeginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicWebTableHandles {

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
		 action.moveToElement(driver.findElement(By.xpath("//i[@class='users icon']"))).build().perform();
		 driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		 action.moveToElement(driver.findElement(By.xpath("//th[contains(text(),'Address')]"))).build().perform();


		 // select contact checkbox
		 
		 //driver.findElement(By.xpath("//a[contains(text(),'Rugin P K')]/parent::td//preceding-sibling::td//input[@name='id']")).click();
		 
		 driver.findElement(By.xpath("//a[contains(text(),'Rugin P K')]//parent::td//preceding-sibling::td//child::div//input[@name='id']")).click();
		 
		 
		// driver.findElement(By.xpath("//a[contains(text(),'Anagha K')]//parent::td//preceding-sibling::td//input[@name='id']")).click();
		 

		 
				 


		 

	}

}


