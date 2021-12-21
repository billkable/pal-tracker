package com.vmware.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
	private final String message;

	public PingController(@Value("${greeting.message: Some default message}") String message) {
		this.message = message;
	}

	@GetMapping("/")
	public String ping() {
		return "Greetings! Pinging you from " + message;
	}

}
