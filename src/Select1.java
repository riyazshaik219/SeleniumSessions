import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1 {
public static void main(String[] args) throws Exception {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	WebElement ele = driver.findElement(By.id("day"));
	Select select = new Select(ele);

Thread.sleep(3000);


List<WebElement> list1 = select.getOptions();
for(WebElement webelement : list1) {
	System.out.println(webelement.getText());

		
		
		
		
	
}
}
}
