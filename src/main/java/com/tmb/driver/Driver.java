package com.tmb.driver;

public class Driver {

	public static void initDriver() { //LocalDriverFactory

		LocalDriverFactory.getDriver().get("http://google.co.in");
	}

	public static void quitDriver() {
		LocalDriverFactory.getDriver().quit();
	}
}
