package com.gcr.scripts;

import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.Checkout_Function;

public class Checkout_scripts extends StartBrowser{
	@Test
	public void Checkout_scriptsTestcases()throws Exception{
		Checkout_Function cfs = new Checkout_Function();
		cfs.Tablets();
		Thread.sleep(9000);
		
	}
	

}
