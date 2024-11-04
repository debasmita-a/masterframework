package com.tmb.config.converters;

import java.lang.reflect.Method;

import org.aeonbits.owner.Converter;

import com.tmb.enums.RunModeType;

public class StringToRunModeTypeConverter implements Converter<RunModeType>{

	@Override
	public RunModeType convert(Method method, String runMode) {
		return RunModeType.valueOf(runMode.toUpperCase());
	}

}
