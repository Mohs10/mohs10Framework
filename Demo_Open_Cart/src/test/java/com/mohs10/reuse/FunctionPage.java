package com.gcr.reuse;

import org.openqa.selenium.WebDriver;

import com.gcr.config.StartBrowser;
import com.gcr.or.CartPage;
import com.gcr.or.HomePage;
import com.gcr.or.ProductPage;
import com.gcr.wdcmds.ActionDriver;

public class FunctionPage {

	public ActionDriver aDriver;
	public WebDriver driver;

	public FunctionPage()
	{
	aDriver = new ActionDriver();
	driver = StartBrowser.driver;
	}

	public void selectCategory() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Select catgory of product");
	aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
	aDriver.mouseHover(HomePage.lnkElectronics, "Electronics link");
	aDriver.click(HomePage.lnkCellphone, "Cellphone link");
	}

	public String addProductToCompare() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Add a product to CART");
	aDriver.click(ProductPage.imgProduct, "Product Image");
	String pName=aDriver.getText(ProductPage.textProduct, "Name of the product");
	aDriver.click(ProductPage.btnCompareList, "Add to Compare Button");
	return pName;
	}

	public String addProductToCompare1() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Add 2nd product to CART");
	aDriver.mouseHover(HomePage.lnkElectronics, "Electronics link");
	aDriver.click(HomePage.lnkCellphone, "Cellphone link");
	aDriver.click(ProductPage.imgProduct1, "2nd Product Image");
	String p1Name=aDriver.getText(ProductPage.textProduct1, "Name of the 2nd product");
	aDriver.click(ProductPage.btnCompareList1, "Add to Compare Button");
	return p1Name;
	}



	public String CompareProductName() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from Cart");
	String cProductName=aDriver.getText(CartPage.lnkComapreProductname, "Name of the product in compare page");
	return cProductName;
	}



	public String CompareProductName1() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Get 2nd product Name from Cart");
	String cProductName1=aDriver.getText(CartPage.lnkComapreProduct1name, "Name of the 2nd product in compare page");
	return cProductName1;
	}
	public void search() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Select catgory of product");
	aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
	aDriver.mouseHover(HomePage.lnksearchbar, "searchbar");
	aDriver.type(HomePage.lnksearchbar, "Smartphone" , "Add Mouse text to searchbar");
	aDriver.click(HomePage.clksearchbar, "click on search button");
	}
	public void AddShoppingCart() throws Exception
	{
	StartBrowser.childTest = StartBrowser.parentTest.createNode("Select catgory of product");
	aDriver.click(CartPage.btnSmartphone, "Goes back to smartphone page");
	aDriver.click(ProductPage.btnAddCart, "Goes to shopping cart");
	aDriver.click(ProductPage.btnShoppingCart, "Goes to cart for checkout");
	}
	}


