package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingFrames2 {

 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		 driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//using Index
		
		WebElement secondtab = driver.findElement(By.linkText("Iframe with in an Iframe"));
		secondtab.click();
		
		switchToFrame(1);
		
		switchToFrame(0);
		
		
		WebElement textbox = driver.findElement(By.tagName("input"));
		textbox.sendKeys("selenium");
		
		
		switchToDefaultContent();
		
		 driver.findElement(By.cssSelector("body > section > div.container.center > div > div > div > div.col-xs-11.col-xs-offset-1 > div > ul > li:nth-child(1) > a")).click();
		
		
		
	}
	public static void switchToDefaultContent() {
		driver.switchTo().defaultContent();
		
		
	}
	public static void switchToFrame(int i) {
		driver.switchTo().frame(i);
		
	}

}
