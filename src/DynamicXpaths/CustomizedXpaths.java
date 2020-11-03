package DynamicXpaths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizedXpaths {
public static void main(String[] args) {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.half.ebay.com");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java");
	//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("php");
	//everytime when u refresh the page, id keeps on changing is called dynamic ids.below is the contains and starts-with solution
	//driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("oracle");
	//driver.findElement(By.xpath("//input[starts-with(@id,'gh-ac')]")).sendKeys("sql");
	//for custom link paths
	//all the links are represented by <a>html tag
	driver.findElement(By.xpath("//a[contains(text(),'Advanced')]")).click();
}
}
//How will u handle dynamic ids?
//By using contains and starts-with,ends-with