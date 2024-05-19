package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	
	@Test
	public void demo() {
		String a = "Qspiders";
		String b = "Qspiders";
		
		Assert.assertEquals(a, b);
		System.out.println("Pass");
	}

	@Test
	public void demo1() {
		String a = "Qspiders";
		String b = "spiders";
		
		Assert.assertTrue(a.contains(b));
		System.out.println("Pass");
	}

}
