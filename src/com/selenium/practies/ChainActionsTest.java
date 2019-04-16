package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ChainActionsTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement shop=driver.findElement(By.id("nav-link-shopall"));
		WebElement apv=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[4]/span"));
		WebElement videos=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[4]/a[1]/span[1]"));
		
		Actions chain=new Actions(driver);
		chain.moveToElement(shop).moveToElement(apv).pause(2000).moveToElement(videos).click().build().perform();
		
		

	}

}
