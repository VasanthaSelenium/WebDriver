package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableTest {

	public static void main(String[] args) throws Exception 
	{
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
		driver.findElement(By.linkText("Employee List")).click();
		//rows
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		//System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++) 
		{
			//column count
		List<WebElement>   col=rows.get(i).findElements(By.tagName("td"));
		//System.out.println(col.size());
		//for (int j = 0; j < col.size(); j++) 
		//{
			System.out.println(col.get(2).getText());
		//}
		}
		

	}

}
