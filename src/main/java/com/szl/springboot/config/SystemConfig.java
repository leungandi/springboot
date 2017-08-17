package com.szl.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix="system")
@PropertySource("systemConfig.properties")
public class SystemConfig {
	
	private String maxCount;
	private String minCount;
	public String getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(String maxCount) {
		this.maxCount = maxCount;
	}
	public String getMinCount() {
		return minCount;
	}
	public void setMinCount(String minCount) {
		this.minCount = minCount;
	}
	@Override
	public String toString() {
		return "SystemConfig [maxCount=" + maxCount + ", minCount=" + minCount + "]";
	}
	
	

}
