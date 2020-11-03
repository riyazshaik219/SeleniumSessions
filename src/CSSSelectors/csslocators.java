package CSSSelectors;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

import junit.framework.Assert;

public class csslocators {
	@Test
public  void Test() {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	String Expected = "#69a74e";
	WebElement btnlogin = driver.findElement(By.name("websubmit"));
	String btncolor = btnlogin.getCssValue("background-color");
	System.out.println(btncolor);
	
	String hexcolor = Color.fromString(btncolor).asHex();
	System.out.println(hexcolor);
	
	String Actual = hexcolor;
	Assert.assertEquals(Expected, Actual);
	
}
}
