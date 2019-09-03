package com.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;


public class HomePage extends TestBase{
	

	@FindBy(xpath="//div[contains(text(),'Nikita')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//div[@id='container']//div[@class='_2aUbKa' and text()='More']")
	WebElement moreLabel;
	
	@FindBy(xpath="//div[@id='container']//div[@class='_1jA3uo']//div[@class='_2dcihZ']")
	WebElement CartLabel;
	
	@FindBy(xpath="//input[@name='q']")
	WebElement SearchBox;

public HomePage(){
	PageFactory.initElements(driver, this);
}

public String verifyHomePageTitle(){
	return driver.getTitle();
}

public boolean verifyUserNameLogo(){
 	return userNameLabel.isDisplayed();
}

public void clickOnMore(){
	moreLabel.click();
}



}
