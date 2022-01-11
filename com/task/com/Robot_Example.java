package com.task.com;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Example {
	
	public static void main(String[]args) throws Throwable 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		
		dr.get("http://automationpractice.com/index.php?");
		dr.manage().window().maximize();
		
		WebElement tshirts = dr.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		Actions ac =new Actions(dr);
		ac.contextClick(tshirts).build().perform();
		
		Robot r =new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

}
}