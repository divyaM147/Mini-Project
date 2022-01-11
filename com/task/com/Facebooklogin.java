package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {
	
	public static void main(String[]args) throws Throwable
	{
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver_update\\chromedriver.exe");
		
		WebDriver dr =new ChromeDriver();
		
		dr.get("https://www.facebook.com/");
		
        dr.manage().window().maximize();
        
        Thread.sleep(4000);
        
      //  WebElement changeLang = dr.findElement(By.xpath("//a[@title='English (UK)']"));
        //changeLang.click();
		
		WebElement mail = dr.findElement(By.xpath("//input[@type='text']"));
		mail.sendKeys("jessy26@gmail.com");
		
		WebElement password = dr.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("09876543212");
		
		Thread.sleep(4000);
		
		WebElement loginbutton = dr.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		Thread.sleep(3000);
		
		dr.close();
		
		
		
	}
	
	

}
