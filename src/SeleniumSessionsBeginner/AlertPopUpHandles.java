package SeleniumSessionsBeginner;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type='submit' or @title='Sign in']")).click(); // click on login button
		
		Thread.sleep(5000);
			
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct message");
		}
		
		else {
			System.out.println("incorrect message");
		}
		
		alert.accept();
		
		alert.dismiss();// to click on cancel button
		
		
		
		
		
		
	}

}
