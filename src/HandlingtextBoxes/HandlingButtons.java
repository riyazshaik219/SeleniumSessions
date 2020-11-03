package HandlingtextBoxes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingButtons {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement malebutton=driver.findElement(By.cssSelector("input[value='Male']"));
		
		malebutton.click();
		
		driver.findElement(By.cssSelector("input[value='FeMale']")).click();
		

	}

}
