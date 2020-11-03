package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	WebDriverWait wait = new WebDriverWait(driver,30);
	boolean val1 = wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
	System.out.println(val1);
	
}
}
