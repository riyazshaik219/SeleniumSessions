package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class annotations {
@Test
public void test() {
	System.out.println("test cases");
}
@Ignore
public void ignore() {
	System.out.println("this will ignore");
}
@Before
public void before() {
	System.out.println("Before test");
}
@BeforeClass
public  static void beforeclass() {
	System.out.println("Before Class");
}
@After
public void after() {
	System.out.println("After test");
}
@AfterClass
public static  void afterclass() {
	System.out.println("After class");
}
}
