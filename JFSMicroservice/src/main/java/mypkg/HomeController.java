package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Configuration
public class HomeController {
	@Autowired
	private RestTemplate restTemplate;
  @GetMapping("/home")
  public String home()
  {String score=restTemplate.getForObject("http://localhost:8082/score", String.class);
	  return score;
	  
	  //return"welcome to homepage";
  }
	
}
