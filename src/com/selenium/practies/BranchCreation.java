package com.selenium.practies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreation {

	public static void main(String[] args) throws Exception
	{
		//appLaunch
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Primusbank.qedgetech.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//appLogin
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		//branchCreation
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys("Vasuva32561");
		driver.findElement(By.id("txtAdd1")).sendKeys("");
		driver.findElement(By.id("txtZip")).sendKeys("444444");
		
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByIndex(1);
		//Thread.sleep(2000);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByIndex(1);
		//Thread.sleep(2000);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByIndex(1);
		
		driver.findElement(By.id("btn_insert")).click();
		Alert al=driver.switchTo().alert();
		String msg=al.getText();
		al.accept();
		//validation
		if(msg.contains("created Sucessfully"))
		{
			System.out.println("Pass");
		}else
			if(msg.contains("already Exist"))
			{
				System.out.println("Fail");
			}else
				if(msg.contains("Please fill in"))
				{
					System.out.println("Warning");
				}
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		
		//applogout
		driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
				
		//appclose
		driver.close();
	}

}
