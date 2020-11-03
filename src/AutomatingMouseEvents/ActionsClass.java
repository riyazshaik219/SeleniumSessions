package AutomatingMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
public static void main(String[] args) {
	String baseurl = "http://www.facebook.com";
	FirefoxDriver driver = new FirefoxDriver();
	driver.get(baseurl);
	WebElement txtusername = driver.findElement(By.xpath("//*[@id='email']"));
	Actions builder = new Actions(driver);
	//Actions a = builder.moveToElement(txtusername).contextClick();
	Actions a = builder.moveToElement(txtusername).sendKeys(txtusername,"riyaz@gmail.com");
	//Actions a = builder.moveToElement(txtusername).keyUp(txtusername, Keys.SHIFT);
	a.perform();
}
}
