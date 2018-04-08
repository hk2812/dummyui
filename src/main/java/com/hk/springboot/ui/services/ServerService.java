package com.hk.springboot.ui.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.hk.springboot.ui.config.ServerConfigList;

@Service
public class ServerService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ServerService.class);

	private final ServerConfigList serverConfigList;

	@Autowired
	public ServerService(ServerConfigList properties) {
		this.serverConfigList = properties;
	}

	@PostConstruct
	public List<String> getServers() {

		LOGGER.info("Method getServers");
		LOGGER.info("check:" + this.serverConfigList.getEnvrn());
		List<String> cfg = this.serverConfigList.getFiles();
		LOGGER.info("from config:" + cfg);
		List<String> test = new ArrayList<String>();
		test.add("test1");
		test.add("test2");
		return test;

	}
}
