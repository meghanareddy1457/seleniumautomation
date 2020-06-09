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



public class pomactitimeleavetype extends basepage implements autoconstant {
	public WebDriver driver;
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings']")
	private WebElement settingsbutton;
	
	@FindBy(xpath="//a[contains(text(),'Leave Types')]")
	private WebElement leavetypesbutton;
	
	@FindBy(xpath="(//span[contains(text(),'Create Leave Type')])[1]")
	private WebElement createleavetypebutton;
	
	@FindBy(id="leaveTypeLightBox_nameField")
	private WebElement leavetypetextfield;
	
	@FindBy(xpath="(//span[contains(text(),'Create Leave Type')])[2]")
	private WebElement createleavetype1button;
	
	@FindBy(id="leaveTypeLightBox_cancelBtn")
	private WebElement cancelbutton;
	
	@FindBy(xpath="//span[.='meghanaleave']/../../../../../..//td[@class='leaveTypeDeleteCell last']")
	private WebElement cancelleavetypebutton;
	
	public pomactitimeleavetype(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
	public void leavetypeofwork() throws InterruptedException, IOException
	{
		settingsbutton.click();
		Thread.sleep(5000);
		leavetypesbutton.click();
		createleavetypebutton.click();
		Thread.sleep(5000);
		leavetypetextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, "actitimedata", 1, 3));
		createleavetype1button.click();
	}
	public void cancelleavetype() throws InterruptedException
	{
		settingsbutton.click();
		Thread.sleep(5000);
		leavetypesbutton.click();
		cancelleavetypebutton.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	

}
