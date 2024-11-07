package com.tmb.driver.manager.mobile.local;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public final class AndroidManager {

	private AndroidManager() {}
	
	public static WebDriver getDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		//capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+ "/android-app.apk");
		return new ChromeDriver();
	}
}
