package com.mohs.reuse;

import org.openqa.selenium.WebDriver;

import com.mohs.config.StartBrowser;
//import com.mohs.or.Productpage;
//import com.mohs.or.Signinpage;
import com.mohs.or.YSctsus;
import com.mohs.or.YShomepage;
import com.mohs.or.YSloginpage;
import com.mohs.or.homepage;
import com.mohs.or.loginhomepage;
import com.mohs.wdcmds.ActionDriver;

public class yourshop {

	public ActionDriver aDriver;
	public WebDriver driver;
	
	public yourshop() 
	{
		aDriver =new ActionDriver();
		driver =StartBrowser.driver;
	}
	
	public void signin() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("user signin ");
		aDriver.navigateToApplication("https://demo.opencart.com/index.php?route=common/home");
		aDriver.click(YShomepage.Myacc, "click on myaccount btn");
		aDriver.click(YShomepage.login, "click on login btn btn");
		aDriver.type(YSloginpage.txtemail, "gayatrimohapatra1414@gmail.com", "entering mail id");
		aDriver.type(YSloginpage.txtped, "gayatri@123", "entering pwd");
		aDriver.click(YSloginpage.btnlogin, "click on login btn");
		aDriver.click(YShomepage.btnctus, "click on contact us btn");
	}
	public void contactus() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Contact Us");
		//aDriver.navigateToApplication("https://demo.opencart.com/index.php?route=common/home");
		
		aDriver.type(YSctsus.txtname, "Gayatri","giving name");
		//aDriver.type(YSctsus.txtmail,"gayatrimohapatra1414@gmail.com", "giving mail");
		aDriver.type(YSctsus.txtquery,"fdgtfhntrshmjhjngf","Entering query text");
		aDriver.click(YSctsus.btnsubmit, "click on submit btn");
		aDriver.click(YSctsus.btncontinue, "click on continue btn");
		
		
	}
}
