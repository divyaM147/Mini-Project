package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragandDrop {

	
		public static void main(String[]args) 
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
			WebDriver dr=new ChromeDriver();
			
			dr.get("http://leafground.com/pages/drop.html");
			dr.manage().window().maximize();
			
			WebElement drag = dr.findElement(By.xpath("//div[@id='draggable']"));
			WebElement drop = dr.findElement(By.xpath("//div[@id='droppable']"));
			
			Actions ac =new Actions(dr);
			
			ac.dragAndDrop(drag, drop).build().perform();
			
			
			
			
			
	}
}
