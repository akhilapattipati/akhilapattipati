package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class baseclass {
	public static WebDriver  driver;
	public static void openAplication() {
		driver=new ChromeDriver() ;
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
Reporter.log("openapplication");
			
		}
	public static void closeaplication() {
		driver.close();
		Reporter.log("close aplication");
	}
	}


