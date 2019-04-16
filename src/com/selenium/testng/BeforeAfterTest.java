package com.selenium.testng;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTest
{
	FirefoxDriver driver;
	@Test
	public void appLogin()
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
	}
	@BeforeTest
	public void appLaunch()
	{
		driver=new FirefoxDriver();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		Assert.assertTrue(driver.findElement(By.id("txtuId")).isDisplayed());
	}
	@AfterTest
	public void appClose()
	{
		driver.close();
	}
}
