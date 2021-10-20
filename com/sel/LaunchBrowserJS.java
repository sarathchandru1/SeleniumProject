package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserJS {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\sarath\\SeliniumChandru\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement user1 = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass1 = driver.findElement(By.id("pass"));
		WebElement logIn = driver.findElement(By.name("login"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','rssarathchandru@gmail.com')",user1);
		Object o = js.executeScript("return arguments[0].getAttribute('value')",user1);
		String s = (String)o;
		System.out.println(s);
		js.executeScript("arguments[0].setAttribute('value','9566207738')",pass1);
		js.executeScript("arguments[0].click()",logIn);
		
		
	}

}
