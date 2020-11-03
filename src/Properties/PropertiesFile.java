package Properties;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFile {
public static void main(String[] args) throws Exception {
	FileInputStream file = new FileInputStream("D:\\Riyaz\\SeleniumRevisionPractice\\src\\ObjectRepository.properties");
Properties prop = new Properties();
prop.load(file);
System.out.println(prop.getProperty("username"));
}
}
