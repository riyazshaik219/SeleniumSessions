package Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectCalender {
public static void main(String[] args) {
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.spicejet.com");
	List<WebElement> list = driver.findElements(By.tagName("a"));
	System.out.println(list.size());
	
	for(int i=0;i<list.size();i++) {
		String text = list.get(i).getText();
		System.out.println(text);
		
	}
	
	
	
	
}
}
