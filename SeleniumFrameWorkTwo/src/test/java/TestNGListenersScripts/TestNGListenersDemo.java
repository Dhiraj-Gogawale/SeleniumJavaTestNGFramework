//In below script we have use TestNG Listners at class level.
package TestNGListenersScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// @Listeners(packageName.ClassName)
@Listeners(TestNGListenersScripts.TestNGListeners.class)
public class TestNGListenersDemo {
	
	@Test
	public void Test1() {
		System.out.println(" I am inside Test1 ");
	}
	
	@Test
	public void Test2() {
		
		System.out.println(" I am inside Test2 ");
	}
	
	@Test
	public void Test3() {
		System.out.println(" I am inside Test3 ");
	}
	
	

}
