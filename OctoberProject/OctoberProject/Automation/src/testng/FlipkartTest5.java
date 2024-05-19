package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FlipkartTest5 {
	
	@DataProvider
	public Object[][] data() {
		
		Object[][] arr=new Object[3][2];
		
		arr[0][0] = "Hrithik";
		arr[1][0] = "B.K.";
		arr[2][0] = "Shilpa";
		
		arr[0][1] = "Laptop";
		arr[1][1] = "Iphone";
		arr[2][1] = "Tab";
		
		return arr;
		
	}

	
	@Test(dataProvider = "data")
	public void selectProduct(String customerName, String productName) {
		System.out.println(customerName+" has selected "+productName);
	}
}
