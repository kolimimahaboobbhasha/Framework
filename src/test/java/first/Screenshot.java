package first;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		ChromeOptions ss=new ChromeOptions();
		ss.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(ss);	
		driver.get("https://www.facebook.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File r = ts.getScreenshotAs(OutputType.FILE);
		File d=new File("./photo/facebook.png");
		FileUtils.copyFile(r, d);
		
		WebElement fb=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		File src=fb.getScreenshotAs(OutputType.FILE);
		File des=new File("./photo/facebook2.png");
		FileUtils.copyFile(src, des);
	}

}
