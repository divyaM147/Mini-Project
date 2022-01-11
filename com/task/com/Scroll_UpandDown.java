package com.task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_UpandDown {
	
	public static void main(String[]args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr =new ChromeDriver();
		
		//dr.get("https://www.amazon.in/");
		
		dr.get("https://www.edureka.co/?msclkid=9fb64717dcd51f1c325d264d71619cca&utm_source=bing&utm_medium=cpc&utm_campaign=Brand-Search-India%20(Core)&utm_term=edureka&utm_content=Edureka%3A%20Core%3A%20BMM");
		
		
	    dr.manage().window().maximize();
	    
	    JavascriptExecutor js =(JavascriptExecutor) dr;
	// ================    AMAZON   AND    EDUREKA   ===============
//        js.executeScript("window.scrollBy(0,5000)");
//        Thread.sleep(3000);
//	    js.executeScript("window.scrollBy(0,-4000)");
	    
	//  ==============AMAZON===========    
//	WebElement aus = dr.findElement(By.xpath("//a[text()='Australia']"));
//	js.executeScript("arguments[0].scrollIntoView();",aus);
//	
//	Thread.sleep(3000);
//	WebElement trending = dr.findElement(By.xpath("//h2[text()='Trending deals']"));
//	js.executeScript("arguments[0].scrollIntoView();",trending);

	    //  ============EDUREKA===========
      WebElement categories = dr.findElement(By.xpath("//h3[text()='Categories']"));
      js.executeScript("arguments[0].scrollIntoView();",categories);
      
      Thread.sleep(3000);
      
      WebElement explore = dr.findElement(By.xpath("//p[text()='Explore our wide range of courses']"));
      js.executeScript("arguments[0].scrollIntoView();",explore);
     
     
     
	}
}

