package first;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class bha {
@Test
public static void ANUsha() throws InterruptedException {
	
		ChromeOptions nee=new ChromeOptions();
		nee.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(nee);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	Thread.sleep(3000);
//
//driver.switchTo().frame(("callout"));
//driver.findElement(By.xpath("//button[text()='No thanks']")).click();
//driver.switchTo().defaultContent();
WebElement ee;
ee=driver.findElement(By.id("APjFqb"));
ee.sendKeys("hii");
ee.sendKeys(Keys.ENTER);




//	try {
//		driver.findElement(By.id("help")).click();
//	}
//	catch(Exception e)
//	{
//		System.out.println("no element found");
//		//throw(e);
//	}
//System.out.println("hello");
	}


	}


