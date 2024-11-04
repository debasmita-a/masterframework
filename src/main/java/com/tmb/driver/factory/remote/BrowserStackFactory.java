package com.tmb.driver.factory.remote;

import org.openqa.selenium.WebDriver;

import com.tmb.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.tmb.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import com.tmb.enums.BrowserType;

public final class BrowserStackFactory {
	
	private BrowserStackFactory() {}

	public static WebDriver getDriver(BrowserType browserType) {
		return browserType == BrowserType.CHROME 
				? BrowserStackChromeManager.getDriver()
				: BrowserStackFirefoxManager.getDriver();
	}

}
