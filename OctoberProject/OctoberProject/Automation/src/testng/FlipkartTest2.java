package testng;

import org.testng.annotations.Test;

public class FlipkartTest2 {

	@Test(priority = 1)
	public void login() {
		
		System.out.println("The user has logged in");

	}

	@Test(priority = 4, enabled = false)
	public void logout() {

		System.out.println("The user has logged out");
	}

	@Test(priority = 2)
	public void selectProduct() {

		System.out.println("The product has been selected");
	}

	@Test(priority = 3)
	public void addToCart() {

		System.out.println("The product is added to cart");
	}

}
