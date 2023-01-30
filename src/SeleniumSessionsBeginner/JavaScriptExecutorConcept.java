package SeleniumSessionsBeginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		driver.get("https://flipkart.com/");
		
		System.out.println("The title before login --- " + driver.getTitle());
		
        Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']")).sendKeys("anagha.k91@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("L0ndonBridge");
	}
}

		
		//driver.findElement(By.xpath("//div[@class='_1D1L_j']//button[@type='submit']")).click();
		
	
		




