package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AdminLogin
{
@Test
public void adminLogin()
{
	String userName="Admin";
	String password="Admin";
	FirefoxDriver driver=new FirefoxDriver();
	driver.navigate().to("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("txtuId")).sendKeys(userName);
	driver.findElement(By.id("txtPword")).sendKeys(password);
	driver.findElement(By.id("login")).click();
}
}
