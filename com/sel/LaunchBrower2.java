package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrower2 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\sarath\\SeliniumChandru\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String fbUrl = "https://www.facebook.com/";
	driver.get(fbUrl);
	driver.manage().window().maximize();
	WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
	userName.sendKeys("sarathchandru");
	WebElement passWord = driver.findElement(By.xpath("//input[@id='pass']"));
	passWord.sendKeys("12345");
	WebElement logIn = driver.findElement(By.xpath("//button[@name='login']"));
	logIn.click();
}
}
