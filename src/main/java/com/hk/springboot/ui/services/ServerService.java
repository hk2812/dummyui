package com.hk.springboot.ui.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import com.hk.springboot.ui.config.ServerConfigList;

@Service
@EnableConfigurationProperties
public class ServerService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ServerService.class);
	
	@Autowired
	ServerConfigList configProperties;        

	public List<String> getServers(){
		
		LOGGER.info("Method getServers");
		List<String> cfg = configProperties.getFileNames();
		LOGGER.info("from config:"+cfg);
		List<String> test = new ArrayList<String>();
		test.add("test1");
		test.add("test2");
		return test;
		
	}
}
