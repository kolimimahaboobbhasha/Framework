package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
 WebDriver driver;
 @BeforeMethod
	public void Test1()
	{
	ChromeOptions rrr = new ChromeOptions();
	rrr.addArguments("--remote-allow-origins=*");
	 WebDriver driver = new ChromeDriver(rrr);
	 
	driver.get("http://www.amazon.com");

	}
 @Test
 public void nnn() {
	String Actual = driver.getTitle();
	
	System.out.println(driver.getTitle());
	
	}
	 @AfterMethod
	 public void vvv() {
		 driver.quit();
	 }
 }
 
 
 

