package com.tmb.config;

import java.net.URL;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;

import com.tmb.config.converters.StringToURLConverter;

@LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
	//"system.properties",
	//"system.env",
	"file:./src/test/resources/browser-stack.properties"	
})
public interface BrowserStackConfig extends Config{
	
	@Key("username")
	String userName();
	String key();
	
	@ConverterClass(StringToURLConverter.class)
	@DefaultValue("https://${userName()}:${key}@hub-cloud.browserstack.com/wd/hub")
	URL browserStackURL();

}
