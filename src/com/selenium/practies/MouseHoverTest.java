package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement signin=driver.findElement(By.id("nav-link-yourAccount"));
		WebElement ywl=driver.findElement(By.xpath(".//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span"));
		
		Actions mouse=new Actions(driver);
		mouse.moveToElement(signin).build().perform();
		mouse.moveToElement(ywl).click().build().perform();
		

	}

}
