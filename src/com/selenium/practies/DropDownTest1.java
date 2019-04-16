package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest1 {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.quikr.com/");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//a[@id='searchedCat']")).click();
	Thread.sleep(2000);
		
		List<WebElement> dropList=driver.findElements(By.xpath("//*[@id='category-dropdown']/ul/li/a"));
		System.out.println(dropList.size());
		for (int i = 0; i < dropList.size(); i++) 
		{
			System.out.println(dropList.get(i).getText());
			
		}

	}

}
