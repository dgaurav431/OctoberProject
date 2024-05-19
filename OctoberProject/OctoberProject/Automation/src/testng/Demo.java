package testng;

import org.testng.annotations.Test;

public class Demo {
	
	@Test(priority = 1)
	public void rohan() {
		System.out.println("Hello");
	}
	
	@Test(priority = -2)
	public void akash() {
		System.out.println("Hi");
	}
	
	
	@Test(priority = 3)
	public void jitesh() {
		System.out.println("How r u");
	}

}
