package com.cysomel.sbbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SbBackendApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "[sbbackend] Hey, i'm alive";
    }
	
    @RequestMapping("/bluetooth/devices")
    @ResponseBody
    String blueToothDevices() {
        return "[sbbackend/bluetooth/devices] Testing BT devices.";
    }    
    
	public static void main(String[] args) {
		SpringApplication.run(SbBackendApplication.class, args);
	}
}
