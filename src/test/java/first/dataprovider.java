package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class dataprovider {
	WebDriver driver;
	@Test(dataProvider="MB")
	public void mmm(String name,String pass) {
		ChromeOptions ss=new ChromeOptions();
		ss.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(ss);
		driver.get("http://www.instagram.com");
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pass);
		
	}
	
	

		
		@DataProvider(name="MB")
		public Object[][]m() {
		Object[][] obj=new Object[3][2];
		obj[0][0]="basha";
		obj[0][1]="kmb";
		obj[1][0]="sandhya";
		obj[1][1]="nna";
		obj[2][0]="Anusha";
		obj[2][1]="nna";
		return obj;

	}

}
