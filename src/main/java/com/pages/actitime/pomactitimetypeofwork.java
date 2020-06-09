package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.ExcelLibrary;
import com.generics.actitime.autoconstant;
import com.generics.actitime.basepage;



public class pomactitimetypeofwork extends basepage implements autoconstant {
	public WebDriver driver;
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings']")
	private WebElement seetingsbutton;
	@FindBy(xpath="//a[contains(text(),'Types of Work')]")
	private WebElement typeofworkbutton;
	@FindBy(xpath="//span[contains(text(),'Create Type of Work')]")
	private WebElement createtypeofworkbutton;
	@FindBy(id="name")
	private WebElement nametextfield;
	@FindBy(xpath="//input[contains(@value,' Create Type of Work')]")
	private WebElement createtypeofwork1button;
	@FindBy(xpath="//input[contains(@value,' Cancel')]")
	private WebElement cancelbutton;
	@FindBy(xpath="//a[.='meghanawork']/../..//a[contains(text(),'delete')]")
	private WebElement canceltypeworkbutton;
	public pomactitimetypeofwork(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void typeofwork() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		seetingsbutton.click();
		typeofworkbutton.click();
		createtypeofworkbutton.click();
		Thread.sleep(3000);
		nametextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, "actitimedata", 1, 4));
		createtypeofwork1button.click();
}
	public void canceltypeofwork()
	{
		canceltypeworkbutton.click();
		Alert alt= driver.switchTo().alert();
		alt.accept();
	}
	
}
