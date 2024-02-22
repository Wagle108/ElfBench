package com.demowebshop.testscripts;

import org.testng.annotations.Test;

import com.demowebshop.genericLibrary.BaseTest;
import com.demowebshop.pomRepo.AddToCart;
import com.demowebshop.pomRepo.LoginPage;

public class ShoppingCartTest extends BaseTest {
@Test
public void sCart() {
AddToCart ac = new AddToCart(driver);
ac.clickCart();
	
	

}
}