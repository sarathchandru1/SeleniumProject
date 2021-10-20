package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver","E:\\sarath\\SeliniumChandru\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	 driver.get(url);
	}
	public static void enterText(WebElement ele,String value) {
		ele.sendKeys(value);
		}
	public static void clickEle(WebElement ele) {
		ele.click();
	}
public static String getTextEle(WebElement ele) {
	String text = ele.getText();
	return text;
}
}
