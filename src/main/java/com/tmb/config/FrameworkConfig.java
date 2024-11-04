package com.tmb.config;

import java.net.URL;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;

import com.tmb.config.converters.StringToBrowserTypeConverter;
import com.tmb.config.converters.StringToURLConverter;
import com.tmb.enums.BrowserRemoteModeType;
import com.tmb.enums.BrowserType;
import com.tmb.enums.RunModeType;

@LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	"file:./src/test/resources/config.properties"	
})
public interface FrameworkConfig extends Config {
	
	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserTypeConverter.class)
	BrowserType browser();
	
	@Key("runModeBrowser")
	@DefaultValue("LOCAL")
	RunModeType runMode();
	
	@Key("browserRemoteMode")
	BrowserRemoteModeType remoteModeType();
	
	@ConverterClass(StringToURLConverter.class)
	URL seleniumGridURL();
	
	@ConverterClass(StringToURLConverter.class)
	URL selenoidURL();
}
