package com.hrms.testsripts;

import com.hrms.pages.verifypage;
import com.hrms.utility.baseclass;

import org.testng.annotations.Test;

import com.hrms.pages.loginpages;
import com.hrms.pages.logoutpage;

public class TC001 {
	@Test
	public static void tc001() {
		baseclass.openAplication();
		verifypage.verifyTitle("HRMS");
		loginpages.login("nareshit","nareshit");
		verifypage.verifyTitle("OrangeHRM");
		logoutpage.logout();
		baseclass.closeaplication();
		
	}

}
