package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Dynamic_xpath {
	
	public static void main(String[]args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr =new ChromeDriver();
	     
		dr.get("https://www.myntra.com/");
		WebElement women = dr.findElement(By.xpath("(//a[text()='Women'])[1]"));
		Actions ac =new Actions(dr);
		ac.moveToElement(women).build().perform();
		
		Thread.sleep(3000);
		
		WebElement kurtasAndSuits = dr.findElement(By.xpath("//a[text()='Kurtas & Suits']"));
		ac.click(kurtasAndSuits).build().perform();
		
		Thread.sleep(3000);
		WebElement dress = dr.findElement(By.xpath("(//span[@class='product-strike']//preceding-sibling::span)[1]"));
		

		dress.click();
		String text = dress.getText();
		System.out.println("TO GET THE TEXT OF A WEBELEMENT USING DYNAMIC XPATH");
		System.out.println(text);
		
		
		
	}
	
	
	

}
