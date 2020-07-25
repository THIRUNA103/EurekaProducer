package org.naren.com.EurekhaProducer.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {
	
	@Value("${server.port}")
	private String portVal;
	
	@GetMapping("getport")
	public String show() {
		System.out.println(portVal);
		return "I am in port " + portVal;
	}

}
