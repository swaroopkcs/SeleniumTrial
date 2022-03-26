package com.swaroop.seleniumTrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumScriptTrial {
	
	WebDriver wd;
	@BeforeMethod
	public void setupBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\QA Testing\\Lib\\ChromeDriver99\\chromedriver.exe");
		wd = new ChromeDriver();
		wd.get("https://demoqa.com/login");
		wd.manage().window().maximize();
	}
	
	@Test
	public void loginTrial() {
		WebElement enterUserName = wd.findElement(By.id("userName"));
		enterUserName.sendKeys("swaroopkrishna");
		WebElement enterPassword = wd.findElement(By.id("password"));
		enterPassword.sendKeys("Abc@123456");
//		WebElement search = wd.findElement(By.id("login"));
//		search.click();
	}
	
	public void clickSubmitButton() {
		loginTrial();
		WebElement search = wd.findElement(By.id("login"));
		search.click();
	}

}
