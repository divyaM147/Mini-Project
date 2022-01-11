package com.task.com;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowshandling {
	
	public static void main(String[]args) throws Throwable 
	{
		WebDriver dr=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
		
		WebElement mobiles = dr.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions ac=new Actions(dr);
		ac.contextClick(mobiles).build().perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement bestseller = dr.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		ac.contextClick(bestseller).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement fashion = dr.findElement(By.xpath("//a[text()='Fashion']"));
		ac.contextClick(fashion).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> windowHandles = dr.getWindowHandles();
		
		Iterator<String> it = windowHandles.iterator();
		while(it.hasNext())
		{
		   String title = dr.switchTo().window(it.next()).getTitle();
		   System.out.println(title);
		}
		
		String actualTitle="Amazon.in Bestsellers: The most popular items on Amazon";
		Thread.sleep(3000);
//		while(it.hasNext())
//		{
//			if(dr.switchTo().window(it.next()).getTitle().equals(actualTitle))
//			{
//				break;
//			}
			
		
		for(String id:windowHandles)
		{
			if(dr.switchTo().window(id).getTitle().equals(actualTitle))
			{
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
