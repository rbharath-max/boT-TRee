package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerClientConfiguration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.WeightedResponseTimeRule;

@Configuration
public class RibbonConfig {
	@Autowired
	private IClientConfig iClientConfig;
	
	
	@Bean
	public IPing getIPing() {
		return new PingUrl();
	}
	
	public IRule getIRule() {
		return new WeightedResponseTimeRule();
	}

	

}
