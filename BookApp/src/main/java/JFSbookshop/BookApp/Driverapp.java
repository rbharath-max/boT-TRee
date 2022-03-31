package JFSbookshop.BookApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driverapp {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Mybook book=context.getBean(Mybook.class);
		book.Display();
		
		
		ApplicationContext context1=new AnnotationConfigApplicationContext(AppConfig.class);
		Skydiving sky123=context1.getBean(Skydiving.class);
		sky123.Sky();
		
		
		Altitutde h1=context.getBean(Altitutde.class);
		h1.height();

	}

}
