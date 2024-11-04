package com.tmb.driver;

import org.openqa.selenium.WebDriver;

import com.tmb.driver.manager.web.local.ChromeManager;
import com.tmb.driver.manager.web.local.FirefoxManager;
import com.tmb.enums.BrowserType;

public final class LocalDriverFactory {

	private LocalDriverFactory() {
	}

	public static WebDriver getDriver(BrowserType browserType) {
		return isBrowserChrome(browserType) ? ChromeManager.getDriver() : FirefoxManager.getDriver();
		
	}

	private static boolean isBrowserChrome(BrowserType browserType) {
		return browserType == BrowserType.CHROME;
	}
}
