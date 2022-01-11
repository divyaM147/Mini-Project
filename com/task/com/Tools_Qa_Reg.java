package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools_Qa_Reg {
	
	public static void main(String[]args) throws Throwable
	{
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dr =new ChromeDriver();
		dr.get("https://toolsqa.com/selenium-training#enroll-form");
		
		dr.manage().window().maximize();
		
		WebElement firstname = dr.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("Roshni");
		
		WebElement lastname = dr.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("Alex");
		
		WebElement mail = dr.findElement(By.xpath("//input[@name='email']"));
		mail.sendKeys("roshnialex123@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement mobile = dr.findElement(By.xpath("//input[@name='mobile']"));
		mobile.sendKeys("8903743015");
		
		WebElement country = dr.findElement(By.xpath("//select[@id='country']"));
		country.sendKeys("India");
		
	    WebElement city = dr.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Chennai");
		
		Thread.sleep(3000);
		
		WebElement message = dr.findElement(By.xpath("//textarea[@name='message']"));
		message.sendKeys("Hello");
		
		WebElement code = dr.findElement(By.xpath("//input[@name='code']"));
		code.sendKeys("Qe2t");
			
		
		Thread.sleep(3000);
		
		WebElement sendbtn = dr.findElement(By.xpath("//button[@class='btn btn-block btn-primary']"));
		sendbtn.click();
		
		dr.close();
		
		
		
		
	}

}
