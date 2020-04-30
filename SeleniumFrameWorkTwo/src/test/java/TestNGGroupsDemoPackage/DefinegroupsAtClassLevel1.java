package TestNGGroupsDemoPackage;
import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class DefinegroupsAtClassLevel1 {

	@Test(groups= {"Sanity"})
	public void test11() {
		System.out.println(" This is Test 11 ");
	}

	@Test(groups = {"Sanity" , "Smoke"})
	public void test12() {
		System.out.println(" This is Test 12 ");
	}

	@Test(groups = {"Sanity" , "regression"})
	public void test13() {
		System.out.println(" This is Test 13 ");
	}

	@Test
	public void test14() {
		System.out.println(" This is Test 14 ");
	}

}



