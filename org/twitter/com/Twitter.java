package org.twitter.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
	
	public static void main(String[]args)
	{
		
		System.out.println(" SELENIUM TESTING ");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://twitter.com/login?lang=en");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.navigate().to("https://www.amazon.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.swiggy.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://byjus.com/");
		String pageSource = driver.getPageSource();
	    System.out.println(pageSource);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
