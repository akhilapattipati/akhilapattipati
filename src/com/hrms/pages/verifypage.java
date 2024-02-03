package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.baseclass;

public class verifypage extends baseclass {
public static void verifyTitle(String title) {
	if(driver.getTitle().equals(title)) {
		Reporter.log("title matched"); 
	}
	else
	{
		
		Reporter.log("title not matched");
		Reporter.log(driver.getTitle());
	}
}
}