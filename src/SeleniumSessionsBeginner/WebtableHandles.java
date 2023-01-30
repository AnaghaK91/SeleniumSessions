package SeleniumSessionsBeginner;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class WebtableHandles {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.w3schools.com/html/html_tables.asp"); // Enter url
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//*[@id="customers"]/tbody/tr[1]/th[1] //company
		//*[@id="customers"]/tbody/tr[1]/th[2] //contact
		//*[@id="customers"]/tbody/tr[1]/th[3] //country
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[2]/td[3]
		
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[3]
		
		//*[@id="customers"]/tbody/tr[3]/td[3]
		
		
		String beforeXpath_company = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath_company = "]/td[1]";
		
		String beforXpath_contact =  "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath_contact= "]/td[2]";
		
		String beforXpath_country = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath_country = "]/td[3]";
		
		List<WebElement> rows =  driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("total number of rows : " + (rows.size()-1));
		int rowCount = rows.size();
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Anagha K\\eclipse-workspace\\SeleniumSessions\\src\\com\\testdata\\FlipkartTestdata.xlsx");
		if(!reader.isSheetExist("WebTableValues")) {
		reader.addSheet("WebTableValues");
		reader.addColumn("WebTableValues", "company");
		reader.addColumn("WebTableValues", "contact");
		reader.addColumn("WebTableValues", "country");
	
				
		}
		
		
		// to get all the values 
		/*for(int i=2;i<=7;i++) {
			for(int j=1;j<=3;j++) {
				String actualXpath = beforeXpath+i+afterXpath+j+"]";
				String Text = driver.findElement(By.xpath(actualXpath)).getText();
				System.out.println(Text);
			} */
		
		
		for(int i=2;i<=rowCount;i++) {
			
			
			String actualXpath_company = beforeXpath_company+i+afterXpath_company;
			String CompanyName = driver.findElement(By.xpath(actualXpath_company)).getText();
			System.out.println(CompanyName);
			
			String actualXpath_contact = beforXpath_contact+i+afterXpath_contact;
			String ContactName = driver.findElement(By.xpath(actualXpath_contact)).getText();
			System.out.println(ContactName);
			
			String actualXpath_country = beforXpath_country+i+afterXpath_country;
			String Country = driver.findElement(By.xpath(actualXpath_country)).getText();
			System.out.println(Country);
			
			reader.setCellData("WebTableValues", "company", i, " " );
			reader.setCellData("WebTableValues", "contact", i, " " );
			reader.setCellData("WebTableValues", "country", i, " " );
			
			reader.setCellData("WebTableValues", "company", i, CompanyName );
			reader.setCellData("WebTableValues", "contact", i, ContactName );
			reader.setCellData("WebTableValues", "country", i, Country );
			
		}
		
			
		
		
	}

}
