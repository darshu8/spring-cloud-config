package com.darshan.demo.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class Message {
	@Value("${message: spring config server is not working}")
	String message;

	@RequestMapping("/message")
	public String sayHello() {
		return message;
	}

}
