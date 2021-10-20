package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchActionClass {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver","E:\\sarath\\SeliniumChandru\\drivers\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement clsbtn = driver.findElement(By.xpath("//button[text()='X']"));
	clsbtn.click();
	WebElement target = driver.findElement(By.xpath("//div[text()='Fashion']"));
	Actions acc = new Actions(driver);
	acc.moveToElement(target).perform();
	
	
}
}
