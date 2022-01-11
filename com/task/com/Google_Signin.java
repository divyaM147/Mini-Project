package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Signin {
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		dr.manage().window().maximize();
		
		WebElement firstN = dr.findElement(By.id("firstName"));
		firstN.sendKeys("Sarah");
		
		WebElement lastN = dr.findElement(By.name("lastName"));
		lastN.sendKeys("Das");
		
		WebElement userN = dr.findElement(By.name("Username"));
		userN.sendKeys("sweetysarahdas123");
		
		WebElement passW = dr.findElement(By.name("Passwd"));
		passW.sendKeys("321sadharas");
		
		WebElement confirm = dr.findElement(By.name("ConfirmPasswd"));
		confirm.sendKeys("321sadharas");
		
		//dr.navigate().refresh();
		
		WebElement next = dr.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]"));
		next.submit();
		
		
		
	}

}
