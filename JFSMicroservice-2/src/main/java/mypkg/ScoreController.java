package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ScoreController {
	@GetMapping("/score")
	  public String score()
	  {
		  return"welcome to scorepage";
	  }

}
