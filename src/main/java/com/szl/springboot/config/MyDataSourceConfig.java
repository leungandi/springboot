package com.szl.springboot.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 第一种方式：
 * 自定义配置数据源
 * 此处我们使用alibaba的druid数据源
 * 1.我们需要手动配置数据源，见以下代码
 * 2.如果需要监控页面,还需要额外配置filter和servlet
 * 
 * 第二种方式
 * 推荐使用官方的配置，官方推荐 参考：https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter#%E5%A6%82%E4%BD%95%E9%85%8D%E7%BD%AE-filter
 * 1.在 Spring Boot项目中加入druid-spring-boot-starter依赖
 * 2.在properties中配置属性
 * 只需配置已上两项,即可使用,无需额外配置以下代码，无需代码配置servlet和filter就可以使用监控页面，方便快捷

 * @author SongZhangLiang
 * @date 2017年8月17日 下午6:16:45
 */
@Configuration
@ConfigurationProperties(prefix="spring.datasource.druid")
public class MyDataSourceConfig {

	private String url;	
	private String username;	
	private String password;	
	private int initialSize;
	private int minIdle;
	private int maxActive;
	private long maxWait;
	private long timeBetweenEvictionRunsMillis;
	private String validationQuery;
	private long minEvictableIdleTimeMillis;
	private boolean testWhileIdle;
	private boolean testOnBorrow;
	private boolean testOnReturn;
	private boolean poolPreparedStatements;
	

	@Bean
	public DataSource dataSource11() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setInitialSize(initialSize);//初始化时建立物理连接的个数
		dataSource.setMaxActive(maxActive);//最大连接池数量
		dataSource.setMinIdle(minIdle);//最小连接池数量
		dataSource.setMaxWait(maxWait);//获取连接时最大等待时间，单位毫秒。
		dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		dataSource.setValidationQuery(validationQuery);//用来检测连接是否有效的sql
		dataSource.setTestOnBorrow(testOnBorrow);//申请连接时执行validationQuery检测连接是否有效
		dataSource.setTestOnReturn(testOnReturn);
		dataSource.setTestWhileIdle(testWhileIdle);//建议配置为true，不影响性能，并且保证安全性。
		dataSource.setPoolPreparedStatements(poolPreparedStatements);//是否缓存preparedStatement，也就是PSCache
		return dataSource;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}


	public long getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}



	public int getInitialSize() {
		return initialSize;
	}



	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}



	public int getMinIdle() {
		return minIdle;
	}



	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}



	public int getMaxActive() {
		return maxActive;
	}



	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}



	public long getMaxWait() {
		return maxWait;
	}



	public void setMaxWait(long maxWait) {
		this.maxWait = maxWait;
	}



	public long getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}



	public void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}



	public String getValidationQuery() {
		return validationQuery;
	}



	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}



	public long isMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}



	public void setMinEvictableIdleTimeMillis(long minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}



	public boolean isTestWhileIdle() {
		return testWhileIdle;
	}



	public void setTestWhileIdle(boolean testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}



	public boolean isTestOnBorrow() {
		return testOnBorrow;
	}



	public void setTestOnBorrow(boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}



	public boolean isTestOnReturn() {
		return testOnReturn;
	}



	public void setTestOnReturn(boolean testOnReturn) {
		this.testOnReturn = testOnReturn;
	}



	public boolean isPoolPreparedStatements() {
		return poolPreparedStatements;
	}



	public void setPoolPreparedStatements(boolean poolPreparedStatements) {
		this.poolPreparedStatements = poolPreparedStatements;
	}

}
