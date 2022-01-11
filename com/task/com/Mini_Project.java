package com.task.com;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project {

	public static void main(String[]args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr =new ChromeDriver();
		
		dr.get("http://automationpractice.com/index.php");
		dr.manage().window().maximize();
		
		WebElement login = dr.findElement(By.xpath("//a[@class='login']"));
		login.click();
		
		JavascriptExecutor js =(JavascriptExecutor) dr;

		js.executeScript("window.scrollBy(0,100)");
		
		WebElement email = dr.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("roshnialex123@gmail.com");
		
		WebElement passwd = dr.findElement(By.xpath("//input[@id='passwd']"));
		passwd.sendKeys("321xelainhsor");
		
		WebElement signin = dr.findElement(By.xpath("//button[@id='SubmitLogin']"));
		signin.click();
		
		WebElement dresses = dr.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	Actions ac =new Actions(dr);
		
		ac.moveToElement(dresses).build().perform();
		
		WebElement evngDresses = dr.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		ac.click(evngDresses).build().perform();
		
		js.executeScript("window.scrollBy(0,800)");
		
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		WebElement image = dr.findElement(By.xpath("//img[@itemprop='image']"));
		ac.moveToElement(image).build().perform();
		
		WebElement addtoCart = dr.findElement(By.xpath("//span[text()='Add to cart']"));
		ac.click(addtoCart).build().perform();
		
		
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement proceedBtn = dr.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		Thread.sleep(3000);
		
		ac.moveToElement(proceedBtn).click(proceedBtn).build().perform();
		
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement proceed2 = dr.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		ac.click(proceed2).build().perform();
		   Thread.sleep(3000);

    	WebElement proceedAddress = dr.findElement(By.xpath("//button[@name='processAddress']"));
    	proceedAddress.click();
	
	   WebElement checkbox = dr.findElement(By.xpath("//input[@type='checkbox']"));
	   checkbox.click();
	    
	   WebElement processcarrier = dr.findElement(By.xpath("//button[@name='processCarrier']"));
	   processcarrier.click();
	   
	   WebElement pay = dr.findElement(By.xpath("//a[@class='bankwire']"));
	   pay.click();
	   
	   WebElement confirmorder = dr.findElement(By.xpath("(//button[@type='submit'])[2]"));
	   confirmorder.click();
	   
	   TakesScreenshot ts=(TakesScreenshot) dr;
	   File source = ts.getScreenshotAs(OutputType.FILE);
	   File desti=new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject\\screenshot\\ss3.png");
	   
	   FileUtils.copyFile(source, desti);
	   
	   
		
	}
	
	
}
