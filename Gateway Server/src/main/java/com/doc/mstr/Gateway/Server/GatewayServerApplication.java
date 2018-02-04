package com.doc.mstr.Gateway.Server;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
// @ComponentScan("com.doc.mstr.Gateway.Server.filters")
public class GatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServerApplication.class, args);
	}

	/*
	 * @Bean public PreFilter preFilterBean() { return new PreFilter(); }
	 */
	@Bean
	public PreFilter simpleFilter() {
		return new PreFilter();
	}
}
