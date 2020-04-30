//Using @Ingnore annotation to ignore methods at class level

package TestNGIgnoreTestDemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class IgnoreTestatClassLevelDemo {
	
	@Test
	public void test1() {
		System.out.println(" I am inside Test 1 ");
	}
	
	@Test
	public void test2() {
		System.out.println(" I am inside Test 2 ");
	}
	
	@Test
	public void test3() {
		System.out.println(" I am inside Test 3 ");
	}
	
	

}
