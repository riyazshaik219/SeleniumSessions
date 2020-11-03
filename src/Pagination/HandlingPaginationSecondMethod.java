package Pagination;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class HandlingPaginationSecondMethod {

@Test
public void HandlingPagination() throws InterruptedException {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://datatables.net/");
	
	List<WebElement> namesElements = driver.findElementsByCssSelector("#example>tbody>tr>td:nth-child(1)");
	
    List<String> names = new ArrayList<String>();

    for(WebElement ele: namesElements) {
    	names.add(ele.getText());
    }
    String nextbuttonclass = driver.findElement(By.id("example_next")).getAttribute("class");

    while(!nextbuttonclass.contains("disabled")) {
    	driver.findElement(By.id("example_next")).click();
    	namesElements = driver.findElementsByCssSelector("#example>tbody>tr>td:nth-child(1)");
    	for(WebElement ele: namesElements) {
        	names.add(ele.getText());
        }
    	nextbuttonclass = driver.findElement(By.id("example_next")).getAttribute("class");
    }
    for(String name: names) {
    	System.out.println(name);
    }
    int totalnames = names.size();
    System.out.println("The total names are:"+totalnames);
    
    String displayedcount= driver.findElement(By.id("example_info")).getText().split(" ")[5];
    System.out.println("The displayed names are:"+displayedcount);
    
    Assert.assertEquals(displayedcount, totalnames);
}
}
