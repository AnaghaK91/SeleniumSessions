package SeleniumSessionsBeginner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LocatorConcept {

	public static void main(String[] args) {
		
		//dropdown:
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		Select select = new Select(driver.findElement(By.id("gh-cat")));
		select.selectByVisibleText("Art");
		//1. Xpath	
			
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click(); 
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Anagha");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("K");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("anagha.k91@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bhadradev2020");
		driver.findElement(By.xpath("//button[@id='EMAIL_REG_FORM_SUBMIT']")).click();
		
		
		//2. id
		//driver.findElement(By.id("lastname")).sendKeys("ABCD");
		//driver.findElement(By.id("Email")).sendKeys("tomabcissuper123@gmail.com");
		
		//3. name
		//driver.findElement(By.name("lastname")).sendKeys("ABCD");
		//driver.findElement(By.name("Email")).sendKeys("tomabcissuper123@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("tom2123@abcissuweper$");
		
		//4. linktext
		
		//driver.findElement(By.linkText("www.ebay.com")).click();
		
		//5. css selecter
		
		//driver.findElement(By.cssSelector("#password")).sendKeys("tom2123@abcissuweper$");
		
		//6. class : not useful : because class name can be duplicate
				
		//driver.findElement(By.className("\"btn btn--primary btn--large btn--fluid")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.quit();
		
		
		
		
		

	}

}
