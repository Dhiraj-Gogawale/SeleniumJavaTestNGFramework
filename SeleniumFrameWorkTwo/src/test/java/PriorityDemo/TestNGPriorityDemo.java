package PriorityDemo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	
	@Test(priority = 1)
	public void One() {
		System.out.println(" I am inside Test 1 ");
		
	}
	
	@Test(priority = 1)
	public void Two() {
		System.out.println(" I am inside Test 2 ");
		
	}

	@Test(priority = 3)
	public void Three() {
		System.out.println(" I am inside Test 3 ");
		
	}


}
