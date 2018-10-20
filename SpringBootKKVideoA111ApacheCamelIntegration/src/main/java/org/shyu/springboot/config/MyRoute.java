package org.shyu.springboot.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C:/Jacky Folder/git/SpringBootKKVideoA111ApacheCamelIntegration/SpringBootKKVideoA111ApacheCamelIntegration/input").to("file:C:/Jacky Folder/git/SpringBootKKVideoA111ApacheCamelIntegration/SpringBootKKVideoA111ApacheCamelIntegration/output");
	}

}
