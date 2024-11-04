package com.tmb.driver.manager.web.remote.browserstack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.tmb.config.ConfigFactory;

public final class BrowserStackChromeManager {

	private BrowserStackChromeManager() {}
	
	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("browserVersion", "129");
		capabilities.setCapability("enableVNC", true);
		capabilities.setCapability("enableVideo", false);
		return new RemoteWebDriver(ConfigFactory.getBrowserStackConfig().browserStackURL(), capabilities);
	}

}