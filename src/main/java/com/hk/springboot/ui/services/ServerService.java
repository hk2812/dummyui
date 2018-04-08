package com.hk.springboot.ui.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import com.hk.springboot.ui.config.Chnnel;
import com.hk.springboot.ui.config.ChnnelConfigList;
import com.hk.springboot.ui.config.ServerConfigList;

@Service
@RefreshScope
public class ServerService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ServerService.class);
	@Value("${message:Hello default}")
    private String message;
	
	@Autowired
	private ServerConfigList serverConfigList;
	
	@Autowired
	private ChnnelConfigList channelConfigList;

	

	
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
	@PostConstruct
	public List<Chnnel> getChannelList() {

		LOGGER.info("Method getChannel");
		
		List<Chnnel> cfg = this.channelConfigList.getChnnels();
	    LOGGER.info("from config:" + cfg);
		return cfg;

	}
	
	public String getMessage() {
		
		return this.message;
	}
}
