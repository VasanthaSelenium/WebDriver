package com.selenium.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM 
{
	FirefoxDriver driver;
	String res;
//appLunch
	public String  appLaunch(String url)
	{
		driver=new FirefoxDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		//validation
		if (driver.findElement(By.id("txtUsername")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	//appLogin
	public String appLogin(String userName,String password) throws Exception
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		//validation
		if(driver.findElement(By.linkText("PIM")).isDisplayed())
		{
			res="Pass";
			
		}else
		{
			res="Fail";
		}
		return res;
	}
	//empReg
	public String empReg(String fName,String lName) throws Exception
	{
		Thread.sleep(2000);
		//EmpCreation
		
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
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
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("Fail");
			res="Fail";
		}
		return res;
	}
	//appLogout
	public String appLogout()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		//validation
				if (driver.findElement(By.id("txtUsername")).isDisplayed())
				{
					res="Pass";
				}else
				{
					res="Fail";
				}
				return res;
	}
	//appClose
	public void appClose()
	{
		driver.close();
	}
	public static void main(String[] args) throws Exception 
	{
		//OrangeHRM app=new OrangeHRM();
		//appLaunch
		/*app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		app.appClose();
		//appLogin
		app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		app.appLogin("Admin","Qedge123!@#");
		app.appLogout();
		app.appClose();
		//EmpReg
		app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		app.appLogin("Admin","Qedge123!@#");
		//app.EmpReg();
		app.appLogout();
		app.appClose();*/
		
		int res=Vasu.add(30, 40);
		System.out.println(res);
	}
}
