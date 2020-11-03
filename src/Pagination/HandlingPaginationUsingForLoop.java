package Pagination;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class HandlingPaginationUsingForLoop {
	
@Test
public void test() throws InterruptedException {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://datatables.net/");
	
	int paginationsize = driver.findElementsByCssSelector("#example_paginate >span >a").size();
	System.out.println(paginationsize);
	
	List<String> names = new ArrayList<String>();
	
	for(int i=1; i<=paginationsize; i++) {
		String paginationSelector = "#example_paginate >span >a:nth-child("+i+")";
		driver.findElement(By.cssSelector(paginationSelector)).click();
		
		List<WebElement> namesElements = driver.findElementsByCssSelector("#example>tbody>tr>td:nth-child(1)");
		for(WebElement ele : namesElements ) {
			names.add(ele.getText());
		}
		
	}
	for(String name : names) {
		System.out.println(name);
	}
	
	int totalnames= names.size();
	System.out.println("total no. of names:" +totalnames);
	
	String displayedcount = driver.findElement(By.id("example_info")).getText().split(" ")[5];
	System.out.println("Total number of displayed names:" +displayedcount);
	
	Assert.assertEquals(displayedcount, String.valueOf(totalnames));
	
	//driver.findElement(By.xpath("//a[contains(text(),'Zorita Serrano')]")).click();
	
	Thread.sleep(5000);
	
	
}
}
