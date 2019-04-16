package com.selenium.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmpReg extends ORange
{
@Test
public void emp() throws Exception
{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("asdfghj");
	driver.findElement(By.id("lastName")).sendKeys("dfdfhfgjgfj");
	driver.findElement(By.id("photofile")).sendKeys("E:\\Koala.jpg");
	//driver.findElement(By.id("photofile")).click();
	
	//AutoIt
	//Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\fileupload.exe");
	
	driver.findElement(By.id("btnSave")).click();
	//driver.navigate().back();
	
}
}
