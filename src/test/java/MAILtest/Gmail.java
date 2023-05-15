package MAILtest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {

	
	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions Chrome=new ChromeOptions();
		Chrome.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(Chrome);
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
		
		 driver.get("https://www.google.com");
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 
		WebElement Entermail=driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
		Entermail.sendKeys("Gmail");
		Entermail.sendKeys(Keys.ENTER);
	    
	    
	WebElement signgmail= driver.findElement(By.xpath("//a[text()='Sign in to Gmail']"));
	 signgmail.click();
	     Thread.sleep(2000);
	 JavascriptExecutor js=( JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,600);");
               
	  driver.findElement(By.xpath("//a[@class=\"action-button\"]")).click();
	 Set<String> Windows=driver.getWindowHandles();
	 Object[]w=Windows.toArray();
 String w1=w[0].toString();
	 String w2=w[1].toString();
 driver.switchTo().window(w2);
		 
	 driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("kmbb4578@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	 
		 
	 
	 
	
	}
}
