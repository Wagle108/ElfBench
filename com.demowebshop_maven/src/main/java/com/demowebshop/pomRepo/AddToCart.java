package com.demowebshop.pomRepo;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart  
{
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
WebElement  product1;

@FindBy(xpath = "(//input[@value='Add to cart'])[2]")
WebElement product2;


public void clickCart() {
	product1.click();
	product2.click();
}
}




