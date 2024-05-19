package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartTest3 {

	@Test(priority = 1)
	public void login() {
		
		System.out.println("The user has logged in");

	}

	@Test(priority = 4, dependsOnMethods = "login")
	public void logout() {

		System.out.println("The user has logged out");
	}

	@Test(priority = 2)
	public void selectProduct() {
		Assert.fail();
		System.out.println("The product has been selected");
	}

	@Test(priority = 3, dependsOnMethods = "selectProduct")
	public void addToCart() {

		System.out.println("The product is added to cart");
	}

}