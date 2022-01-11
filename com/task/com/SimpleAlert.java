package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	
	public static void main(String[]args) throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("http://demo.automationtesting.in/Alerts.html");
		
		dr.manage().window().maximize();
		
		WebElement alertOk = dr.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		alertOk.click();
		
		WebElement alertBox = dr.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alertBox.click();
		
		
		dr.switchTo().alert().accept();
		
		WebElement pracSite = dr.findElement(By.xpath("//a[@href='http://practice.automationtesting.in/']"));
		pracSite.click();
		
		Thread.sleep(5000);
		
		dr.close();
		
		
		
	}

}
