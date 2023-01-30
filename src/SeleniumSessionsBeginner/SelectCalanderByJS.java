package SeleniumSessionsBeginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalanderByJS {

	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	   	   
	driver.get("https://www.spicejet.com/");
		   
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit 
	
	WebElement we = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1i022j5 r-qklmqi r-1kxoodu r-1inuy60 r-ejscvd']"));
	
			
	selectDateByJS(driver, we, null);
	
	}
	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript(dateVal, element);
		
		




		
	}


}
