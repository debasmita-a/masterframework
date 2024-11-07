package com.tmb.base;

import org.junit.jupiter.api.BeforeEach;

import com.tmb.config.ConfigFactory;
import com.tmb.driver.manager.Driver;

public class WebBase {

	@BeforeEach
	public void setup() {
		System.out.println(ConfigFactory.getConfig().remoteModeType());
		Driver.initDriver();
	}
}
