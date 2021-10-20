package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\sarath\\SeliniumChandru\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	String demoUrl = "http://demo.automationtesting.in/Register.html";
	driver.get(demoUrl);
	WebElement fName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	fName.sendKeys("Sarath");
	WebElement lName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lName.sendKeys("Chandru");
	WebElement adrs = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	adrs.sendKeys("18 xxx street ,chennai-56");
	WebElement eMail = driver.findElement(By.xpath("//input[@type='email']"));
	eMail.sendKeys("rssarathchandru@gmail.com");
	WebElement pNo = driver.findElement(By.xpath("//input[@type='tel']"));
	pNo.sendKeys("9566207738");
	WebElement sGen = driver.findElement(By.xpath("//input[@value='Male']"));
	sGen.click();
	WebElement hob = driver.findElement(By.xpath("//input[@value='Cricket']"));
	hob.click();
	WebElement lang = driver.findElement(By.xpath("//div[@id='msdd']"));
	lang.sendKeys("English");
	WebElement sKills = driver.findElement(By.xpath("//select[@id='Skills']"));
	sKills.sendKeys("Java");
	
	

	
}
}
