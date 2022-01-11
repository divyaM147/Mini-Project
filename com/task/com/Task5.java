package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	
	
	public static void main(String[]args) throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.redbus.in/");
		
		dr.manage().window().maximize();
		//Thread.sleep(3000);
		
		WebElement profileIcon = dr.findElement(By.id("//i[@id='i-icon-profile']"));
		profileIcon.click();
		
		
		
		
	}

}
