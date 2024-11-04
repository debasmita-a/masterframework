package com.tmb.tests;

import org.junit.jupiter.api.Test;

import com.tmb.config.ConfigFactory;

public class DemoTest {

	@Test
	public void testLogin() {
		System.out.println(ConfigFactory.getBrowserStackConfig().browserStackURL());
	}
}
