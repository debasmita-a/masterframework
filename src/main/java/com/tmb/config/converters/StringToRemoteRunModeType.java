package com.tmb.config.converters;

import java.lang.reflect.Method;

import org.aeonbits.owner.Converter;

import com.tmb.enums.BrowserRemoteModeType;

public class StringToRemoteRunModeType implements Converter<BrowserRemoteModeType>{

	@Override
	public BrowserRemoteModeType convert(Method method, String remoteMode) {
		return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase());
	}

}
