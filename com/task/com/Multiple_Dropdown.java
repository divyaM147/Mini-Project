package com.task.com;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	
	public static void main(String[]args) throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		dr.manage().window().maximize();
		
		
		WebElement multiSelect = dr.findElement(By.xpath("//select[@name='States']"));
		
		Select s=new Select(multiSelect);
		
		boolean multiple = s.isMultiple();
		System.out.println("check whether options are single or multiple:"+multiple);
		
		
		Thread.sleep(3000);
		
		if(s.isMultiple())
		{
			
			s.selectByIndex(1);
			s.selectByIndex(2);
			
			s.selectByValue("New York");
			s.selectByValue("Ohio");
			
			s.selectByVisibleText("Texas");
			s.selectByVisibleText("Pennsylvania");
	
		}
		
		Thread.sleep(3000);
		
		TakesScreenshot ts=(TakesScreenshot) dr;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\screenshot\\ss1.png");
		FileUtils.copyFile(source, destination);
		
		Thread.sleep(3000);
		
		System.out.println("===GET OPTIONS===");
		
		List<WebElement> options = s.getOptions();
		for(WebElement elmt:options)
			
		{
			System.out.println(elmt.getText());
			
		}
		
		Thread.sleep(3000);
		System.out.println("====ALL SELECTED OPTIONS====");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(WebElement allSelOpt:allSelectedOptions)
			
		{
			System.out.println(allSelOpt.getText());
		}
		
		Thread.sleep(3000);
		System.out.println("===GET FIRST SELECTED===");
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	  
	    s.deselectByIndex(5);
		s.deselectByValue("Ohio");
	   	s.deselectByVisibleText("Pennsylvania");
	   	
	   	System.out.println("===== AFTER DESELECT=====");
	   	
	   	List<WebElement> deSelectOption = s.getAllSelectedOptions();
	   	
	   	for(WebElement deselect:deSelectOption)
	   	{
	   		System.out.println(deselect.getText());
	   	}
		
		Thread.sleep(3000);
		
		dr.close();
		
	}
	

}






