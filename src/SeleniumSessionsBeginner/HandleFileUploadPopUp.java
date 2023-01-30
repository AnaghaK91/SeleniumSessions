package SeleniumSessionsBeginner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@name='fileupload' or @type='file']")).sendKeys("C:\\Users\\Anagha K\\Downloads\\Test Doc.docx");
		
		
 
	}

}
