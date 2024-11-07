package com.tmb.driver.manager;

import org.openqa.selenium.WebDriver;

import com.tmb.config.ConfigFactory;
import com.tmb.driver.factory.remote.RemoteDriverFactory;

public final class Driver {

	public static void initDriver() { //LocalDriverFactory
		//WebDriver driver  = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
		WebDriver driver = RemoteDriverFactory.getDriver(ConfigFactory.getConfig().remoteModeType(), ConfigFactory.getConfig().browser());
		driver.get("http://google.co.in");
	}

	public static void quitDriver() {
		/*
		 * 
		 */
	}
}
