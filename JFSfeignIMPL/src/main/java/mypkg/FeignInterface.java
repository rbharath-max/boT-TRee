package mypkg;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(value = "demo",url = "localhost:8080/iname")
public interface FeignInterface {
	@GetMapping("/uname")
	String getname();
	
	@GetMapping("iname")
	String getActor();

}
