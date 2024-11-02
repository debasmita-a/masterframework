package com.tmb.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tmb.config.ConfigFactory;

public class DemoTest {

	@Test
	public void testLogin() {

		System.out.println(ConfigFactory.getConfig().browser());
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}
}
