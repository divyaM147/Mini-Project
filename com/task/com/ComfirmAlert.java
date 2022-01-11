package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComfirmAlert {
	
	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement alertwithOkCancel = dr.findElement(By.xpath("(//a[@class='analystic'])[2]"));
        alertwithOkCancel.click();
        
        WebElement confirmBox = dr.findElement(By.xpath("//button[@onclick='confirmbox()']"));
        confirmBox.click();
        
        dr.switchTo().alert().accept();
      //  dr.switchTo().alert().dismiss();
	
	
	}
	

}
