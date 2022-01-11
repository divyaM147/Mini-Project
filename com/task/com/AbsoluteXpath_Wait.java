package com.task.com;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbsoluteXpath_Wait {
	
	public static void main(String[]args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr =new ChromeDriver();
		
	   dr.get("http://demo.guru99.com/test/selenium-xpath.html");
	   
	 //  IMPLICIT WAIT
	   
	 dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
   //     ABSOLUTE XPATH
	   
	      Thread.sleep(3000);
	      WebElement seleniumDrop = dr.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a"));
             //  EXPLICIT  WAIT
	   
		   WebDriverWait  wait =new WebDriverWait(dr,30);
		   wait.until(ExpectedConditions.visibilityOf(seleniumDrop));
		   seleniumDrop.click();
		   
	 
	   Robot r =new Robot();
	   r.keyPress(KeyEvent.VK_DOWN);
	   r.keyPress(KeyEvent.VK_DOWN);
	   r.keyRelease(KeyEvent.VK_DOWN);
	   r.keyPress(KeyEvent.VK_ENTER);
	   r.keyRelease(KeyEvent.VK_ENTER);
	   
	
	
	
	
	
	}
}
