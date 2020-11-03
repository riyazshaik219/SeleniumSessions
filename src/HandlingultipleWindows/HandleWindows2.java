package HandlingultipleWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindows2 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new FirefoxDriver();
	driver.get( "http://demo.automationtesting.in/Windows.html");
	
	System.out.println("The title of main window is:"+driver.getTitle());
	
	driver.findElement(By.linkText("Open New Seperate Windows")).click();
	
	WebElement tabbedbutton=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button"));

			tabbedbutton.click();
			Thread.sleep(5000);	

			Set<String> windowsid = driver.getWindowHandles();
			Iterator<String> itr = windowsid.iterator();

			String mainwindow = itr.next();
			String childwindow = itr.next();

			driver.switchTo().window(childwindow);

			System.out.println("The title of child window is:"+driver.getTitle());

			driver.close();

			Thread.sleep(3000);

			driver.switchTo().window(mainwindow);

			System.out.println("The title of main window is:"+driver.getTitle());
}
}
