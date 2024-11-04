package com.tmb.driver;

import org.openqa.selenium.WebDriver;

import com.tmb.enums.BrowserType;

public final class Driver {

	public static void initDriver(BrowserType browserType) { //LocalDriverFactory
		WebDriver driver  = LocalDriverFactory.getDriver(browserType);
		driver.get("http://google.co.in");
	}

	public static void quitDriver() {
		/*
		 * 
		 */
	}
}
