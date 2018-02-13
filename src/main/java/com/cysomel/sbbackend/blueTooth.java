package com.cysomel.sbbackend;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@SpringBootApplication
public class blueTooth extends RouteBuilder {
	  
	public static void main(String[] args) {
		SpringApplication.run(blueTooth.class, args);
	}
	
	@Override
	public void configure() throws Exception {
		 		
		rest("/blueTooth")
		 .get()
			.produces("text/plain")
			.route()
			.routeId("WsTester")
			.process(new Processor() {
				public void process(Exchange exch) throws Exception {
					exch.getIn().setHeader("charset","UTF-8");
					exch.getIn().setBody("[sbbackend/blueTooth] Hey, i'm alive");
				}
			});   
	}
}