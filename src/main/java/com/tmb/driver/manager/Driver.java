package com.tmb.driver.manager;

import org.openqa.selenium.WebDriver;

import com.tmb.driver.factory.local.LocalDriverFactory;
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
