package com.gcr.scripts;

import org.testng.annotations.Test;

import com.gcr.config.StartBrowser;
import com.gcr.reuse.Function_Brand;

public class Script_Brand extends StartBrowser {
	@Test
	public void Script_BrandTestcase() throws Exception{
		Function_Brand afs = new Function_Brand();
		afs.Brand();
		Thread.sleep(9000);
		
		
		
	}

}
