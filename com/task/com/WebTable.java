package com.task.com;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[]args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr =new ChromeDriver();
		
		dr.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		dr.manage().window().maximize();
		
		
		System.out.println("========   ALL DATA  =========");
		
		WebElement page2 = dr.findElement(By.xpath("(//a[@class='paginate_button '])[1]"));
		page2.click();
		
		List<WebElement> alldata = dr.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement data1:alldata)
		{
			System.out.println(data1.getText());
		}
		
		System.out.println("======= ROW DATA  ======");
		
	     List<WebElement> rowdata = dr.findElements(By.xpath("//table/tbody/tr[6]/td"));
	     Iterator<WebElement> iterator = rowdata.iterator();
	     while(iterator.hasNext())
	     {
	    	 System.out.println(iterator.next().getText());
	     }
	     System.out.println("=======  COLUMN  DATA  ======");
	     
	     List<WebElement> column = dr.findElements(By.xpath("//table/tbody/tr/td[1]"));
	     Iterator<WebElement> iterator2 = column.iterator();
	     while(iterator2.hasNext())
	     {
	    	 System.out.println(iterator2.next().getText());
	     }
	     
	     System.out.println("======  PARTICULAR DATA  =======");
	     WebElement specificdata = dr.findElement(By.xpath("//table/tbody/tr[10]/td[6]"));
	     System.out.println(specificdata.getText());
	     
	    
	
	}
}
