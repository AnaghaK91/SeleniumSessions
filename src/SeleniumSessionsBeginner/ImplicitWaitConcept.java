package SeleniumSessionsBeginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// implicit wait is dynamic wait.
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com/");
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait is applicable for all the elements available in the page.
		 
		//driver.quit();
		
		
		
		
		
	}

}
