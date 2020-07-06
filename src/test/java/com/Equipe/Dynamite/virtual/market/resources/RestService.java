package com.Equipe.Dynamite.virtual.market.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


@Service
public class RestService {

	@Autowired
	private Environment environment;

	@Value("${server.servlet.contextPath}")
	private String contextPath;

	

	private int port() {
		return Integer.parseInt(environment.getProperty("local.server.port"));
	}

	public <T> RestBuilder<T> restBuilder(RestBuilder<T> restBuilder) {
		restBuilder.port(this.port());
		restBuilder.path(contextPath);

		return restBuilder;
	}

	public RestBuilder<Object> restBuilder() {
		RestBuilder<Object> restBuilder = new RestBuilder<>(this.port());
		restBuilder.path(contextPath);

		return restBuilder;
	}

}
