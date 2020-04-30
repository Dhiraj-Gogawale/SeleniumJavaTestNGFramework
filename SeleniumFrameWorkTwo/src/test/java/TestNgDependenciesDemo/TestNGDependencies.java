package TestNgDependenciesDemo;

import org.testng.annotations.Test;

public class TestNGDependencies {
	
	
	@Test(dependsOnMethods = {"test2","test3"})
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside Test 3");
	}

}
