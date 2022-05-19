package com.mohs.scripts;

//import org.testng.Assert;
import org.testng.annotations.Test;

import com.mohs.config.StartBrowser;
//import com.mohs.reuse.Cartfuunctionality;
//import com.mohs.reuse.Userregistration;
import com.mohs.reuse.yourshop;

public class ContactUs extends StartBrowser{
	@Test
	public void ContactUsTestCase()  throws Exception{
//method should be name of resuse class		
		yourshop cfs=new yourshop();
		  cfs.signin();
		  Thread.sleep(3000);
		 cfs.contactus();
		  Thread.sleep(3000);
}
}