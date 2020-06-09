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



public class pomactitimecreatecustomer extends basepage implements autoconstant{
	public WebDriver driver;
	@FindBy(id="container_tasks")
	private WebElement taskbutton;
	@FindBy(xpath="//div[contains(text(),'Add New')]")
	private WebElement AddNewbutton;
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement Newcustomerbutton;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EnterCustomerNametextfield;
	@FindBy(xpath="//div[contains(text(),'Create Customer')]")
	private WebElement createcustomerbutton;
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelbutton;
	public pomactitimecreatecustomer(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createcustomer() throws InterruptedException, IOException
	{
		taskbutton.click();
		AddNewbutton.click();
		Newcustomerbutton.click();
		Thread.sleep(3000);
		EnterCustomerNametextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, "actitimedata", 1, 2));
		createcustomerbutton.click();
		
	}
	public void createcustomercancel()
	{
		
		cancelbutton.click();
		Alert alt=	driver.switchTo().alert();
		alt.accept();

}

}
