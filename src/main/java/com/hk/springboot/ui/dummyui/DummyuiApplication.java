package com.hk.springboot.ui.dummyui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hk.springboot.ui."})
public class DummyuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DummyuiApplication.class, args);
	}
}
