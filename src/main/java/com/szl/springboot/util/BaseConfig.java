package com.szl.springboot.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


/**
 * 有时候我们不希望把所有配置都放在application.properties里面
 * 这时候我们可以另外定义一个，这里我取名为system.properties
 * @author SongZhangLiang
 * @date 2017年8月16日 下午6:35:02
 */
@Configuration
@ConfigurationProperties(prefix="system")
@PropertySource("classpath:system.properties")
public class BaseConfig {
	
	
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
		return "BaseConfig [maxCount=" + maxCount + ", minCount=" + minCount + "]";
	}

}
