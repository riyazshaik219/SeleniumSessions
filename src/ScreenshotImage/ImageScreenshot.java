package ScreenshotImage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageScreenshot {
public static void main(String[] args) throws Exception {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.spicejet.com");
	File srcFile = driver.getScreenshotAs(OutputType.FILE);
	File destFile = new File("D:\\spicejet.png");
	FileUtils.copyFile(srcFile, destFile);
	
}
}
