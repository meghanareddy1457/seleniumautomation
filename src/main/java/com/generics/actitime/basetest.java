package com.generics.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class basetest implements autoconstant {
	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);		
    }
	
	

}
