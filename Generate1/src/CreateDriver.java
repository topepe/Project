import org.junit.Test;
import org.openqa.selenium.By;
import org.apache.commons.lang3.RandomStringUtils;
import org.automationtesting.excelreport.Xl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class CreateDriver{
	
	
	public ChromeDriver driver;
	@BeforeMethod
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "/home/christopher/eclipse-workspace/Generate/LIbs/chromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://172.16.0.12:8601");
	
	}
	@AfterMethod
	public void quitDriver() {
		driver.quit();
		
	}
	@AfterSuite
	public void generateReport() throws Exception {
		Xl.generateReport("Report_Excel.xlsx");
		
	}
	
	
	}
	
	
	

	
