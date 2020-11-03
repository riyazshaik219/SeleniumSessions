package AutomatingDropDownBox;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
public static void main(String[] args) {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com");
	
Select day = new Select (driver.findElement(By.xpath("//select[@id='day']")));
day.selectByIndex(26);

Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
month.selectByIndex(1);

Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
year.selectByValue("2018");

}
}
