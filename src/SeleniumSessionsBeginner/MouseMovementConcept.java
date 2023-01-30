package SeleniumSessionsBeginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.incometax.gov.in/iec/foportal/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@class='sf-depth-1 menuparent sf-with-ul'][contains(text(),'Individual/HUF')]"))).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("	//a[@class='sf-depth-2 menuparent sf-with-ul'][contains(text(),'Salaried Employees')]"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[@id='main-menu-link-contente1437778-991d-469b-a432-0bb705a3c269']//a[@class='sf-depth-3'][contains(text(),'Tax slabs')]")).click();
		
		driver.quit();

	}

}
