
package SeleniumSessionsBeginner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertyFile {

	static WebDriver driver;
	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		Properties prop =  new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\Anagha K\\eclipse-workspace\\SeleniumSessions\\src\\SeleniumSessionsBeginner\\Config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
	    String url = prop.getProperty("url");
	    
	    System.out.println(url);
	    System.out.println(prop.getProperty("Browser")); // since browser is entered as 'browser' in property file, console will print null value
		
	    String browserName = prop.getProperty("browser");
		
	    System.out.println(browserName);
		
		if (browserName.equals("chrome")) {
			 driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
			
		}else if(browserName.equals("ie")){
			driver = new InternetExplorerDriver();
			
		}else if(browserName.equals("edge")) {
			driver =  new EdgeDriver();
		}
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(prop.getProperty("firstName_xpath"))).sendKeys(prop.getProperty("firstName"));
		
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastName"));
		
		driver.findElement(By.xpath(prop.getProperty("Email_xpath"))).sendKeys(prop.getProperty("Email"));
		
		driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("Password"));
		
		
		
	}

}
