package com.demowebshop.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demowebshop.genericLibrary.BaseTest;
import com.demowebshop.genericLibrary.ExcelRead;
import com.demowebshop.pomRepo.LoginPage;
import com.demowebshop.pomRepo.WelcomePage;

public class LoginTest extends BaseTest {
@Test(dataProvider="logindata")
public void TC_Login_001(String password,String email) {
	WelcomePage wp=new WelcomePage(driver);
    wp.clickLogin();
    LoginPage lp= new LoginPage(driver);
    lp.emailTextbox(email);
    lp.pwdTextbox(password);
    lp.loginBttn();
}  
    @DataProvider(name="logindata")
    public String[][] loginDataProvider() throws EncryptedDocumentException, IOException{
    	return ExcelRead.multipleRead("Login");
    }

}
