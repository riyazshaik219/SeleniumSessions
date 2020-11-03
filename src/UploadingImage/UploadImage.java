package UploadingImage;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadImage {
public static void main(String[] args) throws Exception {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.quikr.com/Escrow/post-classifieds-ads/?postadcategoryid=1388");
	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]")).click();
	StringSelection selection = new StringSelection("D:\\Note8pro.png");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	Thread.sleep(5000);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(5000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
}
