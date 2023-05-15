package first;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exceptions {

	public static void main(String[] args) {
		ChromeOptions nee=new ChromeOptions();
		nee.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(nee);
	driver.get("https://www.facebook.com/");
	try {
		driver.findElement(By.id("help")).click();
	}
	catch(Exception e)
	{
		System.out.println("no element found");
		//throw(e);
	}
System.out.println("hello");
	}

}
