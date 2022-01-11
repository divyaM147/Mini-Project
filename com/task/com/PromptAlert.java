package com.task.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	
	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		//dr.manage().window().maximize();
		
		dr.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement alertTextBox= dr.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		alertTextBox.click();
		
		WebElement promptBox = dr.findElement(By.xpath("//button[@onclick='promptbox()']"));
		promptBox.click();
		
		Alert alert = dr.switchTo().alert();
		dr.switchTo().alert().sendKeys("Divya");
		alert.accept();
		
		
		
		
		
	}
}
