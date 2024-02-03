package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.baseclass;

public class loginpages extends baseclass {
	static By txt_loginname=By.name("txtUserName");
	static By txt_password=By.name("txtPassword");
	static By btn_login=By.name("Submit");
	
			
	
	public static void login(String un,String pw) {
driver.findElement(txt_loginname).sendKeys(un);
driver.findElement(txt_password).sendKeys(pw);
driver.findElement(btn_login).click();
Reporter.log("login page complted");
	}

}


