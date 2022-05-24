package com.gcr.reuse;

import org.openqa.selenium.WebDriver;

import com.gcr.config.StartBrowser;
import com.gcr.or.Home_Brand;
import com.gcr.wdcmds.ActionDriver;

public class Function_Brand {
	public ActionDriver  aDriver;
	public WebDriver driver;

public Function_Brand()
{
	aDriver = new ActionDriver();
	driver = StartBrowser.driver;
}
public void Brand() throws Exception
{
	StartBrowser.childTest =StartBrowser.parentTest.createNode("Brand name");
	aDriver.navigateToApplication("https://demo.opencart.com/");
	aDriver.click( Home_Brand.lnkMyAccount, "Go to my account link");
	aDriver.click( Home_Brand.lnkLogin, "click on login");
	aDriver.type( Home_Brand.txtEmail, "sumitra.sahoo@mohs10.io", "Type Email Address");
	aDriver.type( Home_Brand.txtPW, "123456789","Password");
	aDriver.click( Home_Brand.btnLogin, "click on login");
	aDriver.click( Home_Brand.lnkBrand, "click on brand");
	aDriver.click( Home_Brand.lnkApple, "click on apple brand");
	aDriver.click( Home_Brand.lnkMacBook, "click on macBook");
	aDriver.click( Home_Brand.btnAddtoCart, "Add to cart btn");
	aDriver.click( Home_Brand.lnkCart, "Click on cart link");
	aDriver.click( Home_Brand.lnkViewCart, "View cart");
}
}
