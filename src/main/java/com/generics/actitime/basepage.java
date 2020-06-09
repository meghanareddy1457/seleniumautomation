package com.generics.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class basepage {
	public void selectbyvisibletext(WebElement element ,String text)
	{
		
		Select sel=new Select(element);
		sel.selectByVisibleText(text);

}
	public void selectbyindex(WebElement element ,int index)
	{
		
		Select sel=new Select(element);
		sel.deselectByIndex(index);

}
	public void selectbyvalue(WebElement element ,String value)
	{
		
		Select sel=new Select(element);
		sel.selectByValue(value);

}
	public void contextclick(WebDriver driver,WebElement onElement)
	{
	  Actions act=new Actions(driver);
	  act.contextClick(onElement);
	
}
}
