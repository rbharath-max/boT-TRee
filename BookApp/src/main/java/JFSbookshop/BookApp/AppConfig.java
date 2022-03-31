package JFSbookshop.BookApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

	@Bean
	public Mybook  createMybook() {
		
		return new Mybook();
		
		
	
	}


	//@Bean
//	public Skydiving  skyDiving() {
	//	
	//	return new Skydiving();
	//}
	
	

}
