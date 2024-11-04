package com.tmb.driver.factory.local;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;

import com.tmb.driver.manager.web.local.ChromeManager;
import com.tmb.driver.manager.web.local.FirefoxManager;
import com.tmb.enums.BrowserType;

public final class LocalDriverFactory {

	private LocalDriverFactory() {
	}
	
	private static final Map<BrowserType, Supplier<WebDriver>>
	                         MAP = new EnumMap<>(BrowserType.class);
	
	static {
		MAP.put(BrowserType.CHROME, ChromeManager::getDriver);
		MAP.put(BrowserType.FIREFOX, FirefoxManager::getDriver);
	}
	
	public static WebDriver getDriver(BrowserType browserType) {
		return MAP.get(browserType).get();
	}

}
