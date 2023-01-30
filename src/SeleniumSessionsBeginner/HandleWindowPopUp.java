package SeleniumSessionsBeginner;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {

		//1. Alerts -- Javascript popup -- Alert API ( Accept, Dismiss)
		
		//2. File upload popup -- Browse button - (type = file, sendKeys(path)
		
		//3. Browser window popup -- Advertisement popup - WindowHandler API -- getWindowhandles()
		
        WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
						
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait is applicable for all the elements available in the page.
				 
		driver.get("http://popuptest.com/goodpopus.html");	
		driver.findElement(null);
		
	   Set<String> handler = 	driver.getWindowHandles();
	   Iterator<String> it = 	handler.iterator();
	   String ParentWIndowId =   it.next();
	   System.out.println("Parent window ID" + ParentWIndowId);
	   String ChildWindowID = it.next();
	   System.out.println("Child window ID " + ChildWindowID);
	   driver.switchTo().window(ChildWindowID);
	   Thread.sleep(2000);
	   System.out.println("child window popup title" + driver.getTitle());
	   driver.close();
	   driver.switchTo().window(ParentWIndowId);
	   Thread.sleep(2000);
	   System.out.println("Parent window popup title" + driver.getTitle());
	   
	   
	   
	   
	}

}
