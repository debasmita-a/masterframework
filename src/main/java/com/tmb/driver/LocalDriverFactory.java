package com.tmb.driver;

import org.openqa.selenium.WebDriver;

import com.tmb.config.ConfigFactory;
import com.tmb.driver.manager.ChromeManager;
import com.tmb.driver.manager.FirefoxManager;
import com.tmb.enums.BrowserType;

public final class LocalDriverFactory {

	private LocalDriverFactory() {
	}

	public static WebDriver getDriver() {
		WebDriver driver = null;
		if (isBrowserChrome())
			driver = ChromeManager.getDriver();
		else
			driver = FirefoxManager.getDriver();

		return driver;
	}

	private static boolean isBrowserChrome() {
		return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
	}
}
