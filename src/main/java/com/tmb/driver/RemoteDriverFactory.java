package com.tmb.driver;

import org.openqa.selenium.WebDriver;

import com.tmb.config.ConfigFactory;
import com.tmb.enums.BrowserRemoteModeType;

public final class RemoteDriverFactory {

	private RemoteDriverFactory() {}
	
	public static WebDriver getDriver() {
		BrowserRemoteModeType browserRemoteModeType = ConfigFactory.getConfig().remoteModeType();
		if(browserRemoteModeType == BrowserRemoteModeType.SELENIUM_GRID) {
			
		}else if(browserRemoteModeType == BrowserRemoteModeType.SELENOID) {
			
		}else {
			
		}
		return null;
	}
}
