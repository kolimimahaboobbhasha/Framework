package first;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class readproperties {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		ChromeOptions dd = new ChromeOptions();
		dd.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(dd);
		FileInputStream fil=new FileInputStream("D:\\Testing\\first\\myfile.properties");
		Properties p=new Properties();
		p.load(fil);
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password");
	}
}
