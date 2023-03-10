package SeleniumSessionsBeginner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
		
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//input[@type='text' or @title='Search']")).sendKeys("Testing");
	
	Thread.sleep(3000);
	

    List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='pcTkSc']//div[@class='wM6W7d']//span[contains(text(),'testing')]"));
    
    
    
    System.out.println("Total number of suggestions " + list.size());
    
    for(int i=0;i<list.size();i++) {
    	System.out.println(list.get(i).getText());
    	if(list.get(i).getText().contains("testing tools")){
    		System.out.println(list.get(i).getText());
    		list.get(i).click();
    		break;
    	}	
   }
	

	}

}





