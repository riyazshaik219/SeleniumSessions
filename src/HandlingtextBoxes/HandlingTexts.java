package HandlingtextBoxes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTexts {
public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement firstnamebox = driver.findElement(By.xpath("//input[@placeholder='First Name' and @ng-model='FirstName']"));
	
	firstnamebox.sendKeys("shaik");
	
WebElement lastnamebox = driver.findElement(By.xpath("//input[@placeholder='Last Name' and @ng-model='LastName']"));
	
lastnamebox.sendKeys("Riyaz");

WebElement textarea = driver.findElement(By.tagName("textarea"));

textarea.sendKeys("Neelasandra");

WebElement email = driver.findElement(By.xpath("//input[@type='email']"));

email.sendKeys("riyazu.shaik@gmail.com");

WebElement phone = driver.findElement(By.xpath("//input[starts-with(@ng-model,'Ph')]"));

phone.sendKeys("7892812797");

firstnamebox.clear();

firstnamebox.sendKeys("shaiku");

	
}
}
