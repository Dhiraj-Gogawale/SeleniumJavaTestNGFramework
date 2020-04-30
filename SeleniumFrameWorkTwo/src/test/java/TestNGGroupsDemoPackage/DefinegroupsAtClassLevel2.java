package TestNGGroupsDemoPackage;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class DefinegroupsAtClassLevel2 {
	
	@Test(groups= {"Sanity"})
	public void test21() {
		System.out.println(" This is Test 21 ");
	}

	@Test(groups = {"Sanity" , "Smoke"})
	public void test22() {
		System.out.println(" This is Test 22 ");
	}

	@Test(groups = {"Sanity" , "regression"})
	public void test23() {
		System.out.println(" This is Test 23 ");
	}

	@Test
	public void test24() {
		System.out.println(" This is Test 24 ");
	}

}
