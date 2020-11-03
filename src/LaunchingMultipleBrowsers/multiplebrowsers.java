package LaunchingMultipleBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class multiplebrowsers {
	static WebDriver driver;
	static String browserName = "firefox";
public static void main(String[] args) {
	
if(browserName.equals("firefox")) {
	driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
}
if(browserName.equals("chrome")) {
	driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
}
if(browserName.equals("internetexplorer")) {
	driver = new InternetExplorerDriver();
	driver.get("http://www.facebook.com");
}

}
}
