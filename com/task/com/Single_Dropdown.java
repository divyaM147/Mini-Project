package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	
	public static void main(String[]args) throws Throwable
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
			
	WebDriver dr =new ChromeDriver();
	dr.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	
	dr.manage().window().maximize();
	
	Thread.sleep(3000);
	
	WebElement singledrop = dr.findElement(By.xpath("//select[@id='select-demo']"));
	
	Select s=new Select(singledrop);
	//s.selectByValue("Sunday");
	
	//s.selectByIndex(4);
	s.selectByVisibleText("Friday");
	
	Thread.sleep(3000);
	
	dr.close();
	
	
		
		
	}

}
