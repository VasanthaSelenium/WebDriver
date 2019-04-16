package com.selenium.practies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it=windows.iterator();
		
		while(it.hasNext())
		{
			String child=it.next().toString();
			//System.out.println(child);
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			driver.close();
			
		}

	}

}
