package com.selenium.practies;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest {

	public static void main(String[] args) throws Exception 
	{//appLaunch
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		//appLogin
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		//EmpCreation
		
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys();
		driver.findElement(By.id("lastName")).sendKeys("Selenium");
		driver.findElement(By.id("photofile")).sendKeys("E:\\Koala.jpg");
		//driver.findElement(By.id("photofile")).click();
		Thread.sleep(2000);
		//AutoIt
		//Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\fileupload.exe");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		//Validation
		if(driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed())
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
//appLogout
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		//appClose
		driver.close();
	}

}
