package TestNGGroupsDemoPackage;

import org.testng.annotations.Test;

public class TestNGGroupDemo {
	
	@Test(groups= {"Sanity"})
	public void test1() {
		System.out.println(" This is Test1 ");
	}
	
	@Test(groups = {"Sanity" , "Smoke"})
	public void test2() {
		System.out.println(" This is Test2 ");
	}
	
	@Test(groups = {"Sanity" , "regression"})
	public void test3() {
		System.out.println(" This is Test3 ");
	}
	
	@Test
	public void test4() {
		System.out.println(" This is Test4 ");
	}

}
