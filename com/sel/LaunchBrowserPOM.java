package com.sel;

public class LaunchBrowserPOM extends BaseClass
{
	public static void main(String[] args) {
		launchBrowser("https://www.facebook.com/");
		LoginPage l = new LoginPage();
		enterText(l.getUserName(),"sarath");
		enterText(l.getPassWord(),"chandru");
		clickEle(l.getLoginBtn());
	}

}
