package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.baseclass;

public class logoutpage extends baseclass{
	static By link_text=By.linkText("Logout");
	public static void logout() {
		driver.findElement(link_text).click();
		Reporter.log("logout page complted");
	}

}
