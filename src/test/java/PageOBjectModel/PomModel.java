package PageOBjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PomModel {
	WebDriver driver;
	PomModel(WebDriver driver){
		this.driver=driver;
	}
public WebElement username() {
	WebElement u=driver.findElement(By.xpath("//input[@type='text']"));
	return u;
}
public WebElement password() {
	WebElement p=driver.findElement(By.xpath("//*[@id='pass']"));
	return p;}
public WebElement login() {
	WebElement l=driver.findElement(By.xpath("//button[@value='1']"));
	return l;}
public void chromeclose() {
driver.close();
}
}
