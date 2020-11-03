package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityOfBtn {
	public static void main(String[] args) {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='u_0_13']")));
}
}