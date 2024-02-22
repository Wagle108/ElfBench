package com.demowebshop.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
public LoginPage(WebDriver driver) {
	super(driver);
}
@FindBy(id = "Email")
WebElement email;
@FindBy(id = "Password")
WebElement password;
@FindBy(xpath = "//input[@value='Log in']")
WebElement lgnbtn;
@FindBy(xpath = "//a[@xpath='1']")
WebElement Book;
public void emailTextbox(String emailId) {
	email.sendKeys(emailId);
}
public void pwdTextbox(String Password) {
	password.sendKeys(Password);
}
public void loginBttn(){
	lgnbtn.click();
}
public void bookLink() {
	Book.click();
}
}
