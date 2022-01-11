package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Login {
	
	public static void main(String[]args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dr =new ChromeDriver();
		
		dr.get("https://www.flipkart.com/");
		
		dr.manage().window().maximize();
		
		WebElement login = dr.findElement(By.xpath("//a[@class='_1_3w1N']"));
		login.click();
		
		Thread.sleep(2000);
		
		//WebElement createAc = dr.findElement(By.xpath("//a[@class='_14Me7y']"));
		//createAc.click();
		
		WebElement mobile = dr.findElement(By.xpath("(//input[@type='text'])[2]"));
		mobile.sendKeys("8903743015");
		
		//WebElement submitbtn = dr.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//submitbtn.click();
		
		//WebElement sendbtn = dr.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//sendbtn.click();
		
		WebElement reqOtp = dr.findElement(By.xpath("(//button[@class='_2KpZ6l _2HKlqd _3NgS1a'])"));
		reqOtp.getAttribute("//button[@class='_2KpZ6l _2HKlqd _3NgS1a'])");
		
		Thread.sleep(3000);
		
	     WebElement cont = dr.findElement(By.xpath("(//button[@type='submit'])[2]"));
	     cont.click();
	   
		
     	WebElement otp = dr.findElement(By.xpath("(//input[@type='text'])[3]"));
		otp.getAttribute("//input[@type='text'])[3]");
		
		WebElement passw = dr.findElement(By.xpath("//input[@type='password']"));
		passw.sendKeys("43015@divya");
		
		Thread.sleep(3000);
		
		WebElement signup = dr.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signup.click();
		
		dr.close();
		
		
		
		
}
}

	

