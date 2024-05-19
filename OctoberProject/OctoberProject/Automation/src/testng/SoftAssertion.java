package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void demo() {
		String a = "Qspiders";
		String b = "Jspiders";
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(a, b);
		
		
		sa.assertAll();
		System.out.println("Pass");
	}
	
	@Test
	public void demo1() {
		String a = "Qspiders";
		String b = "spiders";
		
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(a.contains(b));
		
		System.out.println("Pass");
	}

}
