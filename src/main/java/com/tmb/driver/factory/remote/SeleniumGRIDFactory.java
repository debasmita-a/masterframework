package com.tmb.driver.factory.remote;

import org.openqa.selenium.WebDriver;

import com.tmb.driver.manager.web.remote.seleniumgrid.SeleniumGRIDChromeManager;
import com.tmb.driver.manager.web.remote.seleniumgrid.SeleniumGRIDFirefoxManager;
import com.tmb.enums.BrowserType;


public final class SeleniumGRIDFactory {

	private SeleniumGRIDFactory() {}
	
	public static WebDriver getDriver(BrowserType browserType) {
		return browserType == BrowserType.CHROME 
				? SeleniumGRIDChromeManager.getDriver()
				: SeleniumGRIDFirefoxManager.getDriver();		
	}
}
