package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.basetest;
import com.pages.actitime.pomactitimecreatecustomer;
import com.pages.actitime.pomactitimeframework;
import com.pages.actitime.pomactitimeleavetype;
import com.pages.actitime.pomactitimetypeofwork;

public class testactitime extends basetest{
	@Test
	public void loginactitime() throws IOException {
		pomactitimeframework login=new pomactitimeframework(driver);
		login.actitimecredentials();
		
	}
	@Test(priority = 1)
	public void customercreate() throws InterruptedException, IOException
	{
		pomactitimeframework login=new pomactitimeframework(driver);
		login.actitimecredentials();
		
		pomactitimecreatecustomer create=new pomactitimecreatecustomer(driver);
		create.createcustomer();
		
	}
	@Test(priority = 2)
	
	public void leavetype() throws InterruptedException, IOException
	{
		pomactitimeframework login=new pomactitimeframework(driver);
		login.actitimecredentials();
		pomactitimeleavetype leave=new pomactitimeleavetype(driver);
		leave.leavetypeofwork();
	}
	
	@Test(priority = 3)
	public void worktype() throws InterruptedException, IOException
	{
		pomactitimeframework login=new pomactitimeframework(driver);
		login.actitimecredentials();
		pomactitimetypeofwork work=new pomactitimetypeofwork(driver);
		work.typeofwork();
	
	
	

}
}
