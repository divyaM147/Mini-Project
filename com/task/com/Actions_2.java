package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_2 {
	
	public static void main(String[]args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://demoqa.com/buttons");
		dr.manage().window().maximize();
		
		WebElement doubleclick = dr.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions ac =new Actions(dr);
		
		ac.doubleClick(doubleclick).build().perform();
		
    	WebElement rightclick = dr.findElement(By.xpath("//button[text()='Right Click Me']"));
		ac.contextClick(rightclick).build().perform();
		
		
	}

}
