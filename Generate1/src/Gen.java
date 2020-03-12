import org.junit.Test;
import org.openqa.selenium.By;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Gen extends CreateDriver {
	

	@Test
	public void Terminal() throws Exception {
		driver.findElement(By.xpath("//div[@id='q-app']/div/div[3]/button/div[2]/div")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("10001");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//text()[.='OK']/ancestor::div[1]")).click();
	}
}