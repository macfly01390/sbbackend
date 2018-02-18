package com.cysomel.sbbackend;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class blueTooth extends RouteBuilder {
	  
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