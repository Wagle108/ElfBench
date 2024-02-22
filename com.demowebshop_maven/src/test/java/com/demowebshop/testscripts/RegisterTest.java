package com.demowebshop.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demowebshop.genericLibrary.BaseTest;
import com.demowebshop.genericLibrary.ExcelRead;
import com.demowebshop.pomRepo.RegisterPage;
import com.demowebshop.pomRepo.WelcomePage;

public class RegisterTest extends BaseTest {
@Test(dataProvider = "registerData")
public void TC_Register_001(String first,String last,String email, String password) {
	WelcomePage w= new WelcomePage(driver);
	w.clickRegister();
	RegisterPage r=new RegisterPage(driver);
	r.selectGender();
	r.fnTextbox(first);
	r.lnTextbox(last);
	r.emailidTextbox(email);
	r.pwdTextbox(password);
	r.cnfTextbox(password);
	r.registerButton();
}
@DataProvider(name= "registerData")
public String [][] registerDataProvider() throws EncryptedDocumentException, IOException{
	return ExcelRead.multipleRead("Register");
}
}
