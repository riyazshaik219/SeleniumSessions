package Junit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TitleVerification {
@Test
public void VerifyTitle() {
	String ExpectedValue = "welcome to gmail";
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.gmail.com");
	String ActualValue = driver.getTitle();
	System.out.println(ActualValue);
	Assert.assertEquals(ExpectedValue, ActualValue);
}


}
