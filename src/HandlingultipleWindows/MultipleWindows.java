package HandlingultipleWindows;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {
public static void main(String[] args) {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.naukri.com");
	Set windowsid = driver.getWindowHandles();
	System.out.println(windowsid);
	Object[] data= windowsid.toArray();
	driver.switchTo().window((String)data[1]);
	driver.close();
}
}
