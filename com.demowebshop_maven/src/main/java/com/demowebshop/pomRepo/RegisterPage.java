package com.demowebshop.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage{


public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath = "//label[text()='Gender:']/parent::div/descendant::input[@id='gender-male']")
WebElement gender;
@FindBy(id = "FirstName")
WebElement firstname;
@FindBy(id = "LastName")
WebElement lastname;
@FindBy(id="Email")
WebElement email;
@FindBy(id="Password")
WebElement password;
@FindBy(id="ConfirmPassword")
WebElement confirmpassword;
@FindBy(id = "register-button")
WebElement regbutton;
public void selectGender() {
	gender.click();
}
public void fnTextbox(String first) {

	firstname.sendKeys(first);
}
public void lnTextbox(String last) {

	lastname.sendKeys(last);
}
public void emailidTextbox(String emailid) {
	email.sendKeys(emailid);
}
public void pwdTextbox(String pass) {
	password.sendKeys(pass);
}
public void cnfTextbox(String pass) {
	confirmpassword.sendKeys(pass);
}
public void registerButton() {
	regbutton.click();
}
}