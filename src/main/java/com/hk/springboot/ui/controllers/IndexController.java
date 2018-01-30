package com.hk.springboot.ui.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hk.springboot.ui.services.ServerService;

@RestController
public class IndexController {

	@Autowired
	private ServerService serverService;
	
	@RequestMapping(value="/servers",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<String> servers(){
		
		return serverService.getServers();
	}
}	
