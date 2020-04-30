package TestNgDependenciesDemo;

import org.testng.annotations.Test;

public class TestNGDependenciesWithGrouping {
	
	
	@Test(dependsOnGroups = {"DependancyOne"})
	public void test1() {
		System.out.println("I am inside Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside Test 2");
	}
	
	@Test(groups= {"DependancyOne"})
	public void test3() {
		System.out.println("I am inside Test 3");
	}
	@Test
	public void test4() {
		System.out.println("I am inside Test 4");
	}

}
