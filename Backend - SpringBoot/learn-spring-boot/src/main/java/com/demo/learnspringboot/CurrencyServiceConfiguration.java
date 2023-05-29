package com.demo.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/* Week 5 - Day 5
 * Completed on 2023/05/26
 */

//Takes configuration from application.properties, whatever has currency-service prefix
@ConfigurationProperties(prefix="currency-service")
@Component
public class CurrencyServiceConfiguration {
	private String url;
	private String username;
	private String key;
	
	public CurrencyServiceConfiguration() {

	}
	
	public CurrencyServiceConfiguration(String url, String username, String key) {
		super();
		this.url = url;
		this.username = username;
		this.key = key;
	}
	
	public String getUrl() {
		return url;
	}
	public String getUsername() {
		return username;
	}
	public String getKey() {
		return key;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setKey(String key) {
		this.key = key;
	}
}
