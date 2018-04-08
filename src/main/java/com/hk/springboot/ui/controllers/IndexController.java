package com.hk.springboot.ui.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hk.springboot.ui.config.Chnnel;
import com.hk.springboot.ui.services.ServerService;

//import com.hk.springboot.ui.config.ServerConfigList;
//import com.hk.springboot.ui.services.ServerService;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RestController

public class IndexController {

	@Autowired
	private ServerService serverService;

	private static final Logger log = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping(value = "/servers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Chnnel> servers() {
		log.info("msg:" + serverService.getMessage());
		serverService.getChannelList();
		return serverService.getChannelList();
		//return serverService.getServers();
	}
}
