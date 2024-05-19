package testng;

import org.testng.annotations.Test;

public class FlipkartTest {

	@Test(priority = 1, groups = "smoke")
	public void login() {
		
		System.out.println("The user has logged in");

	}

	@Test(priority = 4, groups = "smoke")
	public void logout() {

		System.out.println("The user has logged out");
	}

	@Test(priority = 2, groups = "regression")
	public void selectProduct() {

		System.out.println("The product has been selected");
	}

	@Test(priority = 3, groups = "regression")
	public void addToCart() {

		System.out.println("The product is added to cart");
	}

}
