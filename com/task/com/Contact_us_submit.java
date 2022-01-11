package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_us_submit {
	
	
	public static void main(String[]args) throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dr =new ChromeDriver();
		
		dr.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		dr.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement contactus = dr.findElement(By.xpath("(//a[@href='contact.php'])[1]"));
		contactus.click();
		
		WebElement name = dr.findElement(By.xpath("(//input[@type='text'])[1]"));
		name.sendKeys("DivyaMala Palanisamy");
		
		WebElement mail = dr.findElement(By.xpath("//input[@placeholder='Email']"));
		mail.sendKeys("divyasherine147@gmail.com");
		
		WebElement mobile = dr.findElement(By.xpath("(//input[@name='phone'])[1]"));
		mobile.sendKeys("6369510515");
		
		WebElement courses = dr.findElement(By.xpath("(//select[@name='courses'])[1]"));
		courses.sendKeys("Selenium");
		
		WebElement branch = dr.findElement(By.xpath("(//select[@name='branch'])[1]"));
		branch.sendKeys("Thambaram");
		
		WebElement time = dr.findElement(By.xpath("(//select[@name='time'])[1]"));
		time.sendKeys("in a month");
		
	  	WebElement message = dr.findElement(By.xpath("//textarea[@class='form-control input-message']"));
		message.sendKeys("*just a task given by sir for practice,don't call*");
		
		Thread.sleep(3000);
		
		WebElement submitbtn = dr.findElement(By.xpath("//button[@id='submit']"));
		submitbtn.click();
		

		Thread.sleep(3000);
		
		dr.close();
	}

	
}












