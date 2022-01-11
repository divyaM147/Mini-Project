package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Ac_Creation {
	
	public static void main(String[]args) throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.facebook.com/");
		
		dr.manage().window().maximize();
		
		
		WebElement changeLang = dr.findElement(By.xpath("//a[@title='English (UK)']"));
		changeLang.click();
		
		WebElement createAcbtn = dr.findElement(By.xpath("(//a[@role='button'])[2]"));
		createAcbtn.click();
		
		Thread.sleep(3000);
		
		WebElement firstN = dr.findElement(By.xpath("//input[@name='firstname']"));
		firstN.sendKeys("Roshni");
		
		WebElement surname = dr.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("Alex");
		
		WebElement mailId = dr.findElement(By.xpath("//input[@name='reg_email__']"));
		mailId.sendKeys("roshnialex123@gmail.com");
		
		WebElement confirmMailId = dr.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		confirmMailId.sendKeys("roshnialex123@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement password = dr.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("321xelainhsor");
		
		WebElement birthday = dr.findElement(By.xpath("//select[@id='day']"));
		
		Select s=new Select(birthday);
		s.selectByIndex(26);
		
		Thread.sleep(3000);
		
		WebElement month = dr.findElement(By.xpath("//select[@id='month']"));
		
		Select s2=new Select(month);
		s2.selectByValue("3");
		
		Thread.sleep(3000);
		
		WebElement year = dr.findElement(By.xpath("//select[@title='Year']"));
		
		Select s3=new Select(year);
		s3.selectByVisibleText("1998");
		
		Thread.sleep(3000);
		
		WebElement gender = dr.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender.click();
		
		Thread.sleep(3000);
		
		WebElement signup = dr.findElement(By.xpath("//button[@name='websubmit']"));
		signup.click();
		
		Thread.sleep(3000);
		
	
		dr.close();
   }

}
