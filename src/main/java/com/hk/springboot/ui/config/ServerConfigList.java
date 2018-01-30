package com.hk.springboot.ui.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "testfiles")
@Component

public class ServerConfigList {

    private List<String> servers;
 
    public List<String> getServers() {
        return servers;
    }
 
    public void setServers(List<String> servers) {
        this.servers = servers;
    }
 
    
}