package SeleniumSessionsBeginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
			
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			
		driver.get("https://register.freecrm.com/register/");
			
		
	//isDisplayed : applicable for all elements	
	 boolean B1 =   driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
	 System.out.println(B1);
	 
	 //isEnabled : for buttons
	 boolean B2 = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	 System.out.println(B2);
	 
	 //isSelected : applicable for checkbox, radiobuttons, dropdown
	 driver.findElement(By.xpath("//input[@id='terms']")).click();
	 boolean B3 =  driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
	 System.out.println(B3);
	 
	 driver.findElement(By.xpath("//input[@id='terms']")).click();
	 boolean B4 =  driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
	 System.out.println(B4);
	  
	

	}

}
