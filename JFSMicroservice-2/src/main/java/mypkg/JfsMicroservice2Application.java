package mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
@RestController
@SpringBootApplication
@EnableHystrix
public class JfsMicroservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(JfsMicroservice2Application.class, args);
	}
	@RequestMapping(value="/n")
	@HystrixCommand(fallbackMethod = "fallback_hello",commandProperties = {
			@HystrixProperty(name="execution.isolation.thread.timeoutInmilliseconds",value = "1000")
			})
	public String hello() throws InterruptedException{
		Thread.sleep(3000);
		return "welcome Hystrix";
	}
	private String fallback_hello() {
		return "Request fails.It takes long time to response";
	}

}
