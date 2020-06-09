package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.generics.actitime.ExcelLibrary;
import com.generics.actitime.autoconstant;
import com.generics.actitime.basepage;


 
public class pomactitimeframework extends basepage implements autoconstant {
	@FindBy(id="username")
	private WebElement usernametextfield;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwdtextfield;
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	@FindBy(xpath="(//div[contains(text(),'Login ')])[1]")
	private WebElement loginButton;
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	private WebElement forgotpasswordlink;
	@FindBy(xpath="//a[contains(text(),'actiTIME Inc')]")
	private WebElement actitimeinclink;
	
	public pomactitimeframework(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void actitimecredentials() throws IOException
	{
	
		usernametextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, "actitimedata", 1, 0));
		pwdtextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, "actitimedata", 1, 1));
		keepLoggedInCheckBox.click();
		loginButton.click();
		
	}
	

	
	
	
	

}
