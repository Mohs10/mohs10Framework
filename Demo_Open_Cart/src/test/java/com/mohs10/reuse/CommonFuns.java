package com.mohs10.reuse;
	import org.openqa.selenium.WebDriver;
	import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.HomePage;

	public class CommonFuns {
		
		public Action aDriver;
		public WebDriver driver;
		
		public CommonFuns()
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
		//go to search field
				public void search(String search) throws Exception
				{
				StartBrowser.childTest = StartBrowser.parentTest.createNode("click searchbox and search for a prod");
				aDriver.navigateToApplication(" https://demo.opencart.com/");
				aDriver.type(HomePage.txtSearch, search, "search keyword textbox");
				aDriver.click(HomePage.btnsearch, "search btn");
				}
				public String prodName() throws Exception
				{
					//aDriver.click(HomePage.lnkMacPro, "MacBookPro product");
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from search");
				    String prodNameMacBookPro=aDriver.getText(HomePage.textProd, "Name of the product");
				    return prodNameMacBookPro;
				}
			//search for a product(cam) available in dashboard(Useful for cam prod & spcl char's text validation)
				public String prodCam() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from search");
					String prodcam = aDriver.getText(HomePage.textcamprod,"get the prod name");
					return prodcam;
				}
			//search for a iphone product and sortby low-high price
				public String prodiPhone() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from search");
					String prodiPhone = aDriver.getText(HomePage.textiPhoneprod,"get the prod name");
					aDriver.click(HomePage.chkProdDes, "click on checkbox");
					aDriver.click(HomePage.btnsrch, "search button");
					aDriver.click(HomePage.ddSortBy, "sortBy low-high");
					return prodiPhone;
					}
				//search without entering keyword
				public void searchwithoutkeyword() throws Exception
				{
				StartBrowser.childTest = StartBrowser.parentTest.createNode("click searchbox and search for a prod");
				aDriver.navigateToApplication(" https://demo.opencart.com/");
				aDriver.click(HomePage.btnsearch, "search btn");
				}
				//search with single character
				public String prodTouchhd() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from search");
					aDriver.click(HomePage.imgTouchhd, "click on image");
					String prodTouchhd = aDriver.getText(HomePage.textTouchhd,"get the prod name");
					return prodTouchhd;
				}
				//search with numerics
				public String prodSamsung() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Get product Name from search");
					aDriver.click(HomePage.imgSamsung, "click on image");
					String prodSamsung = aDriver.getText(HomePage.textSamsung,"get the prod name");
					return prodSamsung;
				}
				//search with Alpha-numerics
				public String prodCanon() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Click on product image & Get product Name from search");
					aDriver.click(HomePage.imgCanon, "click on image");
					aDriver.click(HomePage.imgCanon1, "click on image 1");
					aDriver.click(HomePage.btnClose, "click on close button");
					String prodCanon = aDriver.getText(HomePage.textCanon,"get the prod name");
					return prodCanon;
				}
				 //search with alpha-numeric & special characters	
				public String prodApple() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Click on product image & Get product Name from search");
					aDriver.click(HomePage.imgApple, "click on image");
					aDriver.click(HomePage.classSpecification, "click on specification");
					String prodApple = aDriver.getText(HomePage.textApple,"get the prod name");
					return prodApple;
				}
				//search & give review
				public String prodiMac(String name, String review) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Click on product image & give the review");
					aDriver.click(HomePage.imgiMac, "click on image");
					aDriver.click(HomePage.classReviews, "click on reviews");
					aDriver.type(HomePage.className, name, "Enter your name");
					aDriver.type(HomePage.classReview, review, "Enter review");
					aDriver.click(HomePage.rdRating, "click on rating radio button");
					aDriver.click(HomePage.btnContinue, "click on continue button");
					String prodiMac = aDriver.getText(HomePage.textSuccess,"get the review submitted text");
					return prodiMac;
				}
				
	}

