package com.hk.springboot.ui.dummyui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.hk.springboot.ui.config.ServerConfigList;

@SpringBootApplication

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.hk.springboot.ui" })

public class DummyuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyuiApplication.class, args);
	}
}
