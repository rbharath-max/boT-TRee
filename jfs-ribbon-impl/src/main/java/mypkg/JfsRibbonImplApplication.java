package mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JfsRibbonImplApplication {
	
	
	@Bean
	@LoadBalanced
	public RestTemplate creaTemplate() {
		RestTemplate restTemplate=new RestTemplate();
		return restTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(JfsRibbonImplApplication.class, args);
	}

}
