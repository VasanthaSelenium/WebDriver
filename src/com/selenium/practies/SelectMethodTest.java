package com.selenium.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://amazon.in");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select sl=new Select(drop);
		
		//sl.selectByIndex(26);
		//sl.selectByVisibleText("Books");
		//sl.selectByValue("search-alias=automotive");
		
		/*List<WebElement> dropList=sl.getOptions();
		for (WebElement element : dropList) 
		{
			System.out.println(element.getText());
		}*/
	
		System.out.println(sl.isMultiple());

	}

}
