package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest
{
	public static void main(String[] args) throws Exception {

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		/*for (int i = 0; i < links.size(); i++) 
		{
			System.out.println(links.get(i).getText());
		}*/
		for(WebElement element:links)
		{
			System.out.println(element.getText());
		}

	}

}
