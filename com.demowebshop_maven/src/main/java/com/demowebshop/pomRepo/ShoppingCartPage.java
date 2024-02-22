package com.demowebshop.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//table[@class='cart']/tbody/tr[1]/td[3]/a")
	WebElement shoppingCartFirstRowName;
	public String getshoppingCartFirstRowName() {
		return shoppingCartFirstRowName.getText();
	}
}
