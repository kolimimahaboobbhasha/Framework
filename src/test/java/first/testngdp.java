package first;

import java.io.IOException;
import java.time.Duration;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import org.json.simple.JSONObject;


public class testngdp{
	ExtentSparkReporter Reporter;
	ExtentReports Report;
	ExtentTest Test;

	
		WebDriver driver;
		@BeforeClass
		void setup(){
			
			 ChromeOptions dd = new ChromeOptions();
				dd.addArguments("--remote-allow-origins=*");
			 driver=new ChromeDriver(dd);

			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
		@AfterClass
		void tear() {
			driver.close();
		}
		
		
		
		@Test(dataProvider="MB")
		void login(String data) {
			String r[]=data.split(",");
			driver.get("Http://www.instagram.com");
			driver.findElement(By.name("username")).sendKeys(r[0]);
			driver.findElement(By.name("password")).sendKeys(r[1]);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			 Reporter =new ExtentSparkReporter(System.getProperty("user.dir")+"/Extent/Report2.html");
			 Reporter.config().setDocumentTitle("Instagram");
			 Reporter.config().setReportName("Instagram Reports");
			Reporter.config().setTheme(Theme.STANDARD)	;
		
			Report=new ExtentReports();
			Report.attachReporter(Reporter);
			Report.setSystemInfo("url", "www.Instagram.com");
			Report.setSystemInfo("Reporter-Name", "Bhasha");
			Report.setSystemInfo("platform", "window");
			
			Test=Report.createTest("Create Report");
			Test.log(Status.FAIL, "Test fail");
			
			Report.flush();
		}
		
		@DataProvider(name="MB")
	public String[]readjson() throws IOException, ParseException
				{
			JSONParser a=new JSONParser();
			FileReader b=new FileReader(".\\testdata\\Logindata.json");
			Object c=a.parse(b);
			
			
			JSONObject d=(JSONObject)c;
			JSONArray e=(JSONArray)d.get("userlogins");
			
			String arr[]=new String[e.size()];
			
			
			for(int i=0;i<e.size();i++) 
			{
				JSONObject ee=(JSONObject)e.get(i);
				String u=(String)ee.get("Username");
				String p=(String)ee.get("password");
				arr[i]=u+","+p;
				
			}
			return arr;
				}
		
		
}
