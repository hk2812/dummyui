package com.hk.springboot.ui.config;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "srvrs")
public class ServerConfigList {
	private static final Logger log = LoggerFactory.getLogger(ServerConfigList.class);
	private final List<String> files = new ArrayList<>();
	private String envrn;

	public String getEnvrn() {
		return this.envrn;
	}

	public void setEnvrn(String envrn) {
		this.envrn = envrn;
	}

	public List<String> getFiles() {
		/*
		 * log.info("method getFiles coffee"); if(this.srvrs != null )
		 * log.info("list size:"+this.srvrs.size());
		 */
		return this.files;
	}

	public String check() {
		return "hello ther";
	}

}