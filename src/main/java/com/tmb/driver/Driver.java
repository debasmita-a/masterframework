package com.tmb.driver;

import org.openqa.selenium.WebDriver;

public final class Driver {

	public static void initDriver() { //LocalDriverFactory
		WebDriver driver  = LocalDriverFactory.getDriver();
		driver.get("http://google.co.in");
	}

	public static void quitDriver() {
		/*
		 * 
		 */
	}
}
