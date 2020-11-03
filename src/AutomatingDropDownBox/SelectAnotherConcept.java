package AutomatingDropDownBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//If value doesn't matter, we can use selectByIndex
//SelectByVisibleText is more preferable than SelectByIndex bcoz there are chances that index may change in future. 
public class SelectAnotherConcept {
public static void main(String[] args) {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	
	WebElement day=driver.findElement(By.id("day"));
	WebElement month = driver.findElement(By.id("month"));
	WebElement year = driver.findElement(By.id("year"));
	
	
	SelectFromDropDown(day,"12");
	SelectFromDropDown(month,"May");
	SelectFromDropDown(year,"1993");
	
}

public static void SelectFromDropDown(WebElement element, String value) {
	Select select = new Select(element);
	select.selectByVisibleText(value);
}
}
