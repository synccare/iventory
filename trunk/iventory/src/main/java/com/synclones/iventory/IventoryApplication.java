package com.synclones.iventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.synclones.iventory")
public class IventoryApplication{

//	@Override extends SpringBootServletInitializer
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(IventoryApplication.class);
//    }
	
	public static void main(String[] args) {
		SpringApplication.run(IventoryApplication.class, args);
	}
	
//	public FilterRegistrationBean siteMeshFilter() {
//		FilterRegistrationBean filter = new FilterRegistrationBean();
//		filter.setFilter(new SiteMeshFilter());
//		return filter;
//	}
	
}
