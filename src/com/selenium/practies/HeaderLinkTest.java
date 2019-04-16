package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinkTest 
{

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//header
		//WebElement header=driver.findElement(By.id("nav-xshop"));
		Thread.sleep(2000);
		List<WebElement> headerLinks=driver.findElements(By.xpath("//div[@id='nav-xshop']/a"));
		System.out.println(headerLinks.size());
		for (int i = 0; i <headerLinks.size(); i++) 
		{
			System.out.println(headerLinks.get(i).getText());
		}
		
	}

}
