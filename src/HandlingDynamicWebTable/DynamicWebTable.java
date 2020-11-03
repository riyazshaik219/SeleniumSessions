 package HandlingDynamicWebTable;
//first find the pattern and we have to see variable part(tr) and have to break it.td part is always constant.
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {
public static void main(String[] args) {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	
	List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
	int rowcount = rows.size();
	System.out.println("total no. of rows:" +rowcount);
	//*[@id="customers"]/tbody/tr[2]/td[1]
	//*[@id="customers"]/tbody/tr[3]/td[1]
	
	String beforexpath = "//*[@id='customers']/tbody/tr[";
	String afterxpath = "]/td[1]";
	
	for(int i=2;i<=rowcount; i++) {
		String actualxpath = beforexpath+i+afterxpath;
		WebElement element = driver.findElement(By.xpath(actualxpath));
		System.out.println(element.getText());
	}
		System.out.println("-------");
		
		
		////*[@id="customers"]/tbody/tr[2]/td[2] for contact
		String afterxpathcontact = "]/td[2]";
		for(int i=2;i<=rowcount; i++) {
			String actualxpathcontact = beforexpath+i+afterxpathcontact;
			WebElement element= driver.findElement(By.xpath(actualxpathcontact));
			System.out.println(element.getText());
		}
		
		System.out.println("****");
		//handling web table columns
		
		//*[@id="customers"]/tbody/tr[1]/th[1]
		//*[@id="customers"]/tbody/tr[1]/th[2]
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
		int columncount=columns.size();
		System.out.println("total no. of coulmns is:" +columncount);
		
		
		String beforecolumnxpath = "//*[@id='customers']/tbody/tr[1]/th[";
		String aftercolumnxpath = "]";
		for(int i=1;i<=columncount; i++) {
			String actualcolumnxpath = beforecolumnxpath+i+aftercolumnxpath;
			WebElement element = driver.findElement(By.xpath(actualcolumnxpath));
			System.out.println(element.getText());
		}
	
	
}
}
