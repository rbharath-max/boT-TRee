package skycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Sky.skypojo;
import sky171.skylimits;

@RestController
public class controller {
	
	@Autowired
	private skylimits Skylimits;
	
	@GetMapping("/sss")
	public String add(Model model) {
		model.addAttribute("sky", new skypojo());
		return "add";
	}
	

}
