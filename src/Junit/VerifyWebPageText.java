package Junit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



public class VerifyWebPageText {
@Test
public void pageText() {
	String expectedValue = "username";
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.gmail.com");
	String actualValue = driver.findElement(By.xpath("//*[@id='identifierId']")).getText();
	System.out.println(actualValue);
Assert.assertEquals(expectedValue, actualValue);
}
}
