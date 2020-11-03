package Frames;

//Frame is a area or section of webpage, by using frame we can split webpage into different parts.

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingFrames {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://demo.automationtesting.in/Frames.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement frame = driver.findElement(By.id("singleframe"));
	driver.switchTo().frame(frame);
	
	WebElement textbox = driver.findElement(By.tagName("input"));
	textbox.sendKeys("Selenium");

	driver.switchTo().parentFrame();
	
	WebElement secondtab = driver.findElement(By.linkText("Iframe with in an Iframe"));
	secondtab.click();
	
	
	
	
}
}
