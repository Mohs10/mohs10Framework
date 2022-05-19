package com.gcr.reuse;

import org.openqa.selenium.WebDriver;

import com.gcr.config.StartBrowser;
import com.gcr.or.Checkoutpage;
import com.gcr.wdcmds.ActionDriver;

public class Checkout_Function {
	public ActionDriver aDriver;
	public WebDriver Driver;

	
	public Checkout_Function()
	{
		aDriver = new ActionDriver();
		Driver = StartBrowser.driver;
		
	}
	
	public void Tablets() throws Exception{
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Choose a product");
		aDriver.navigateToApplication("https://demo.opencart.com/");
		aDriver.click(Checkoutpage.lnkTblets, "Tablets link");
		aDriver.click(Checkoutpage.imgprdct,"product image");
	    aDriver.click(Checkoutpage.btnAddtocart, "Add to cart");
	    aDriver.click(Checkoutpage.btnItem, "View item");
	    aDriver.click(Checkoutpage.txtCart, "View cart");
	    aDriver.click(Checkoutpage.btnChckout, "Checkout");
	}

}
