package Junit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class VerifyUrl {
@Test
public void VerifyUrl() {
	String expectedValue = "http://www.gmail.com";
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.olx.com");
	String actualValue = driver.getCurrentUrl();
	System.out.println(actualValue);
	Assert.assertEquals(expectedValue,actualValue);
}
}
