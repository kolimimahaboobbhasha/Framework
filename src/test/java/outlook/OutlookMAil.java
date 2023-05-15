package outlook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
  
public class OutlookMAil {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions rr= new ChromeOptions();
		rr.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(rr);
		driver.get("http://www.outlook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bhasha.k@kairostech.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Mbbasha123@");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Sent Items']")).click();	
	    Thread.sleep(3000);
	   

	    List<WebElement> senditemsbox=driver.findElements(By.xpath("//div[@class='IjzWp XG5Jd gy2aJ Ejrkd']"));

	    for(WebElement ele :senditemsbox) { 
   System.out.println(ele.getText());

	    }
	    driver.get("http://www.google.com");
	    WebElement done=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	    done.sendKeys("I am done");
	    done.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    driver.close();
	  	}

}
