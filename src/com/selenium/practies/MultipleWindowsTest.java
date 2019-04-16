package com.selenium.practies;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();//11111
		//System.out.println(parent);
		
		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String> windows=driver.getWindowHandles();//11111&22222
		/*for (String child : windows) 
		{
			//System.out.println(child);
			
			//driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			driver.close();
			
			if (!driver.getTitle().equals("NetBanking")) 
			{
				driver.close();
			}
			
			if(!parent.equals(child))//11111=22222
			{
				driver.switchTo().window(child);//22222
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			}
		}*/
		
		List<String> tabs=new ArrayList(windows);
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		driver.close();
	}

}
