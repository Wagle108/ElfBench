package com.demowebshop.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPage extends BasePage {

	public BookPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//input[@value='Add to cart']")
	 WebElement addtocartbutton;
	@FindBy(xpath = "//a[text()='shopping cart']")
	 WebElement link;
public void addToCart() {
	addtocartbutton.click();
}
public void link() {
	link.click();
}
}
