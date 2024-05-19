package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(priority = 1)
	public void wakeUp() {
		System.out.println("the user has woken up");
	}
	
	@Test(priority = 2, dependsOnMethods = "wakeUp")
	public void brushYourTeeth() {
		System.out.println("the user has Brushed his teeth");
	}
	
	@Test(priority = 3, dependsOnMethods = "brushYourTeeth", invocationCount = 2)
	public void breakfast() {
		System.out.println("the user has taken breakfast");
	}
	
	@Test(priority = 4)
	public void office() {
		System.out.println("the user is going to office");
	}

}