package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[]args) throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("http://demo.automationtesting.in/Frames.html");
		dr.manage().window().maximize();
		
		//SINGLEFRAME
		
		dr.switchTo().frame("SingleFrame");
		WebElement inputbox = dr.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		
		inputbox.sendKeys("WELCOME");
		Thread.sleep(3000);
		
		dr.switchTo().defaultContent();
		
		WebElement multipleFrame = dr.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multipleFrame.click();
		
		WebElement outerFrame = dr.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		dr.switchTo().frame(outerFrame);
		
		Thread.sleep(3000);
		
		WebElement innerFrame = dr.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
        dr.switchTo().frame(innerFrame);
		
		Thread.sleep(3000);
		
		WebElement inputbox2 = dr.findElement(By.xpath("(//input[@type='text'])"));
		inputbox2.sendKeys("HELLO");
		
		
		
	}
	

}
