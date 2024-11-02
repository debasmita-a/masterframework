package com.tmb.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;

import com.tmb.converters.StringToBrowserTypeConverter;
import com.tmb.enums.BrowserRemoteModeType;
import com.tmb.enums.BrowserType;
import com.tmb.enums.RunModeType;

@LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	//"system.properties",
	//"system.env",
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
}
