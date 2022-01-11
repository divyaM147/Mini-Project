package org.twitter.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.facebook.com/");
		
		dr.manage().window().maximize();
		
	
	}

}
