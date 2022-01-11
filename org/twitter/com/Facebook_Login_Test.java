package org.twitter.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_Test {
	
	public static void main(String[]args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.facebook.com/");
		
		dr.manage().window().maximize();
		
		WebElement mail = dr.findElement(By.id("email"));
		mail.sendKeys("jessy26@gmail.com");
		
		WebElement password = dr.findElement(By.name("pass"));
		password.sendKeys("09876543212");
		
		boolean enabled = password.isEnabled();
		System.out.println(enabled);
		
		Thread.sleep(3000);
		
		WebElement login = dr.findElement(By.name("login"));
		login.click();
		//String text1 = login.getText();
		//System.out.println(text1);
		//login.getAttribute("login");
		
		
		}

}
