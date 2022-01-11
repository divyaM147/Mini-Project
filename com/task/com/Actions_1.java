package com.task.com;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_1{

	public static void main(String[]args) throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		 
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		
		Actions ac =new Actions(driver);
		
		ac.moveToElement(dresses).build().perform();
		
		WebElement casuals = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
		ac.click(casuals).build().perform();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\screenshot\\ss2.png");
		FileUtils.copyFile(source, destination);
		
		
	}
	

}
