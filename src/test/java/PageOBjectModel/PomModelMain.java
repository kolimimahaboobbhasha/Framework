package PageOBjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PomModelMain {
static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions Chrome=new ChromeOptions();
		Chrome.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(Chrome);
		 driver.get("https://www.facebook.com");
		 
		 
		 PomModel p=new PomModel(driver);
		 p.username().sendKeys("bhasha@gmail.com");
		 p.password().sendKeys("gusfiugeue");
		 p.login().click();
		 p.chromeclose();
	}

}
