package first;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class proread {
static WebDriver driver;
	public static void main(String[] args) throws IOException {
		ChromeOptions dd = new ChromeOptions();
		dd.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(dd);
		FileInputStream file=new FileInputStream("D:\\Testing\\first\\myfile.properties");
		Properties pro=new Properties();
		pro.load(file);
		driver.get(pro.getProperty("url"));
		
	}

}
