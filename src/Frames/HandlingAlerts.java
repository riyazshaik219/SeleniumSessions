package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//handling alert boxes with textbox
public class HandlingAlerts {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	
	String pagemessage = driver.findElement(By.cssSelector("p")).getText();
	System.out.println(pagemessage);
}
}
