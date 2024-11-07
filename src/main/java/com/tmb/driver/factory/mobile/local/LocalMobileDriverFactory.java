package com.tmb.driver.factory.mobile.local;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;

import com.tmb.driver.manager.web.local.ChromeManager;
import com.tmb.driver.manager.web.local.FirefoxManager;
import com.tmb.enums.BrowserType;
import com.tmb.enums.MobilePlatfomType;

public final class LocalMobileDriverFactory {

	private LocalMobileDriverFactory() {
	}
	
	private static final Map<MobilePlatfomType, Supplier<WebDriver>>
	                         MAP = new EnumMap<>(MobilePlatfomType.class);
	
	static {
		MAP.put(MobilePlatfomType.ANDROID, ChromeManager::getDriver);
		MAP.put(MobilePlatfomType.IOS, FirefoxManager::getDriver);
	}
	
	public static WebDriver getDriver(BrowserType browserType) {
		return MAP.get(browserType).get();
	}

}
