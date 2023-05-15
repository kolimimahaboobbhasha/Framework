package PageOBjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class PageFactoryMai {
static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions Chrome=new ChromeOptions();
		Chrome.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(Chrome);
		 driver.get("https://www.facebook.com");
		 
		 Page_fatory pf=new Page_fatory(driver);
		 pf.username.sendKeys("bhasha@gmail.com");
		 pf.password.sendKeys("mbbbb");
		 pf.click.click();
		 pf.chromeclose();
	}
}
