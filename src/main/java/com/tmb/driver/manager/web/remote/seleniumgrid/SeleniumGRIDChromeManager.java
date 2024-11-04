package com.tmb.driver.manager.web.remote.seleniumgrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.tmb.config.ConfigFactory;
import com.tmb.enums.BrowserType;

public final class SeleniumGRIDChromeManager {

	private SeleniumGRIDChromeManager() {}
	
	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(String.valueOf(BrowserType.CHROME));
		return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), capabilities);
	}
}
