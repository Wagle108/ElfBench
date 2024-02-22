package com.demowebshop.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.aventstack.extentreports.Status;
import com.demowebshop.genericLibrary.BaseTest;
import com.demowebshop.genericLibrary.ExcelRead;
import com.demowebshop.pomRepo.BookPage;
import com.demowebshop.pomRepo.LoginPage;
import com.demowebshop.pomRepo.ShoppingCartPage;
import com.demowebshop.pomRepo.WelcomePage;

public class AddToCartTest extends BaseTest {
	@Test(dataProvider = "addToCart")
public void TC_ShoppingCart_001(String email,String password) {
	WelcomePage wp=new WelcomePage(driver);
	wp.clickLogin();
	test.log(Status.INFO, "login page is displayed");
	LoginPage lp= new LoginPage(driver);
	lp.emailTextbox(email);
	lp.pwdTextbox(password);
	
	lp.loginBttn();
	wp.booksHeader();
	BookPage bp = new BookPage(driver);
	bp.addToCart();
	bp.link();
	ShoppingCartPage sp= new ShoppingCartPage(driver);
	String text = sp.getshoppingCartFirstRowName();
	System.out.println(text);
}
	@DataProvider(name= "addToCart")
	public String [][] addToCartDataProvider() throws EncryptedDocumentException, IOException{
		return ExcelRead.multipleRead("AddToCart");
	}
}
