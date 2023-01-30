package SeleniumSessionsBeginner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {

		WebDriver driver =  new ChromeDriver();
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
							
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//implicit wait is applicable for all the elements available in the page.
		
		//type = file should be present as locator for browse/ upload file/ attach file
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@name='fileupload' or @type='file']")).sendKeys("C:\\Users\\Anagha K\\Downloads\\Test Doc.docx");
			
		
			

	}

}
