package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class javascript {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("http://demo.automationtesting.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='test@gmail.com'");
	js.executeScript("document.getElementById('enterimg').click()");
	}

}
