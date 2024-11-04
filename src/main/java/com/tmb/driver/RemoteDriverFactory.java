package com.tmb.driver;

import org.openqa.selenium.WebDriver;

import com.tmb.enums.BrowserRemoteModeType;
import com.tmb.enums.BrowserType;

public final class RemoteDriverFactory {

	private RemoteDriverFactory() {}
	
	public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, 
			                             BrowserType browserType) {
		
		if(browserRemoteModeType == BrowserRemoteModeType.SELENIUM_GRID) {
			return SeleniumGRIDFactory.getDriver(browserType);
		}else if(browserRemoteModeType == BrowserRemoteModeType.SELENOID) {
			return SelenoidFactory.getDriver(browserType);
		}else {
			return BrowserStackFactory.getDriver(browserType);
		}

	}
}
