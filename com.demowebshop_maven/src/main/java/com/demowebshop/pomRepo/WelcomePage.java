package com.demowebshop.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage{

public WelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(partialLinkText = "Log in")
WebElement loginLink;
@FindBy(partialLinkText = "Register")
WebElement registerlink;
@FindBy(xpath = "//span[text()='Shopping cart']")
WebElement shoppingcartlink;
@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
WebElement books;
public void  clickLogin() {
	loginLink.click();
	
}
public void clickRegister() {
	registerlink.click();
}
public void shoppingCartLink() {
	shoppingcartlink.click();
}
public void booksHeader() {
	books.click();
}

}