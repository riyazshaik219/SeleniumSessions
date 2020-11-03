package LaunchingFirefoxBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
public static void main(String[] args) {

	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.gmail.com");
	
}
}
