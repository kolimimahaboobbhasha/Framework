package first;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class dropdown {

	public static   void main(String[] args) throws InterruptedException {
		WebDriver driver;
		//WebDriverManager.chromedriver().setup();
  ChromeOptions dd = new ChromeOptions();
		dd.addArguments("--remote-allow-origins=*");
	 driver=new ChromeDriver(dd);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		WebElement ee=(WebElement) driver.switchTo().frame("//body[@contenteditable='false']");
		ee.findElement(By.id("field1")).clear();
		ee.findElement(By.id("field1")).sendKeys("bhasha"); 
		
		Actions aa =new Actions((WebDriver) driver.findElement(By.xpath("//button[@ondblclick='myFunction()']")));
		aa.click(null);
		aa.build().perform();
		
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(3000);
//		WebElement e=driver.findElement(By.id("twotabsearchtextbox"));
//		e.clear();
//		e.sendKeys("bhasha");
//		System.out.println(e.getText());
		
		
		
		
//		WebElement e=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		System.out.println(e.getAttribute("id"));
		//WebElement e=driver.findElement(By.xpath("//*[@aria-describedby='searchDropdownDescription']"));
	
//	Select s=new Select(e);
	//s.selectByVisibleText("Electronics");
//		List<WebElement>t=s.getOptions();
//	
//		
//	System.out.println(t.get(10));	System.out.println(t.get(3).getText());
		
		}
	
		
		
		
		
	}


