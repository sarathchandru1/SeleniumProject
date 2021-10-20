package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrower { 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\sarath\\SeliniumChandru\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.in/";
		driver.get(url);
		driver.manage().window().maximize();
		String cUrl = driver.getCurrentUrl();
		System.out.println(cUrl);
		if(url.equals(cUrl)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
		
	}

}
