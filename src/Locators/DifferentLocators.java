package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DifferentLocators {
	static WebDriver driver;
public static void main(String[] args) {
	driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.facebook.com");
	driver.findElement(By.name("firstname")).sendKeys("Testing");
	driver.findElement(By.id("u_0_o")).sendKeys("campus");
	driver.findElement(By.cssSelector("#u_0_r")).sendKeys("8892652789");
	driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("Psaproject@123");
	driver.findElement(By.linkText("Forgotten account?")).click();
	driver.navigate().back();
	driver.navigate().refresh();
	driver.findElement(By.partialLinkText("Data Poli")).click();
	
	
	
	
}
}
