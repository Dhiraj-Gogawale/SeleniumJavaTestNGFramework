package TestNGRetryOrRerunFailTestDemo;

import org.testng.annotations.Test;

public class TestNGRetryOrRerunFailTest {
	
	@Test
	public void test1() {
		
		System.out.println(" I am inside Test 1 ");
	}
	
	@Test(retryAnalyzer = TestNGRetryOrRerunFailTestDemo.RetryAnalyzer.class)
	public void test2() {
		
		System.out.println(" I am inside Test 2 ");
	    int i=1/0;
 	}
	
	@Test
	public void test3() {
		
		System.out.println(" I am inside Test 3 ");
	}

}
