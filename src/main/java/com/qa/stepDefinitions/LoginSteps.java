package com.qa.stepDefinitions;

import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import cucumber.api.java.en.Given;


public class LoginSteps extends TestBase{
	LoginPage login = new LoginPage();

	
@Given("^Enter valid username and Password$")
public void enter_valid_username() throws Throwable {
    TestBase.initialization();
    String strTitleOfPage= login.validateTitleOfLoginPage();
    System.out.println(strTitleOfPage);
    login.validateFlipkartLogo();
    login.login(prop.getProperty("userName"), prop.getProperty("passWord"));  
}



}
