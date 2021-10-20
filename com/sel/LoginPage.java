package com.sel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
public LoginPage() {
	PageFactory.initElements(driver,this);
}
@CacheLookup
@FindBy(xpath = "//input[@name='email']")
public WebElement userName;
@FindBy(xpath = "//input[@id='pass']")
public WebElement passWord;
@FindBy(xpath = "//button[@name='login']")
public WebElement loginBtn;
public WebElement getUserName() {
	return userName;
}
public WebElement getPassWord() {
	return passWord;
}
public WebElement getLoginBtn() {
	return loginBtn;
}

}
