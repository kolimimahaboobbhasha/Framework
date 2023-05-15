package PageOBjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_fatory{
	WebDriver driver;
	Page_fatory(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
	@FindBy(xpath="//input[@type='text']")WebElement username;
	@FindBy(xpath="//*[@id=\"pass\"]")WebElement password;
	@FindBy(xpath="//button[@value='1']")WebElement click;


    public void chromeclose() {
    	
                 	driver.close();
	}
}
