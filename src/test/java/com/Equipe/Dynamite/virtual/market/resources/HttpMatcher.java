package com.Equipe.Dynamite.virtual.market.resources;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpClientErrorException;

public class HttpMatcher extends TypeSafeMatcher<HttpClientErrorException>{
	
	private HttpStatus expectedHttpStatus;
	
	public HttpMatcher(HttpStatus expectedHttpStatus) {
		this.expectedHttpStatus = expectedHttpStatus;
	}
	
	@Override
	public void describeTo(Description description) {
		description.appendText(" Esperando: ").appendValue(expectedHttpStatus);
	}
	
	@Override
	protected boolean matchesSafely(HttpClientErrorException exception) {
		return expectedHttpStatus.equals(exception.getStatusCode());
	}
}