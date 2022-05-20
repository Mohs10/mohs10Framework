package com.gcr.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.FunctionPage;

public class ScriptPage {
	public class AddProductToCompare extends StartBrowser{
		@Test
		public void AddProductToCompareTestCase() throws Exception {
			FunctionPage cfs = new FunctionPage();
			cfs.selectCategory();
			String pName= cfs.addProductToCompare();
			String cProductName=cfs.CompareProductName();
			Assert.assertEquals(cProductName, pName);
			Thread.sleep(5000);
			String p1Name= cfs.addProductToCompare1();
			String cProductName1=cfs.CompareProductName1();
			Assert.assertEquals(cProductName1, p1Name);
			Thread.sleep(5000);
			cfs.AddShoppingCart();
			Thread.sleep(5000);
		}
	}

}
