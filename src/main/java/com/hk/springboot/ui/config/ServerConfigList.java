package com.hk.springboot.ui.config;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix="filenames")

public class ServerConfigList {
	private static final Logger log = LoggerFactory.getLogger(ServerConfigList.class);
    private List<String> fileNames= new ArrayList<String>();
 
    public List<String> getFileNames() {
    	if(fileNames != null )
    		log.info("list size:"+fileNames.size());
        return fileNames;
    }
 
    
 
    
}