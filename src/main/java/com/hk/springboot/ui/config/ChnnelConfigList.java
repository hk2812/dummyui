package com.hk.springboot.ui.config;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "chnlist")

public class ChnnelConfigList {
	
	private static final Logger log = LoggerFactory.getLogger(ChnnelConfigList.class);
	private final List<Chnnel> chnnels = new ArrayList<>();
	public List<Chnnel> getChnnels() {
		return chnnels;
	}

}
