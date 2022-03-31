package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FeignImpl {
	@Autowired FeignInterface feignInterface;
	
	@GetMapping("/service")
	public String getname() {
		return feignInterface.getname();
	}

}
