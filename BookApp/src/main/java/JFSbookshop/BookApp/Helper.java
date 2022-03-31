package JFSbookshop.BookApp;

import java.security.PublicKey;


import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	
	@Before(value="execution(public void Display())")
	public void logmethod() {
		System.out.println("Instruction: we are going to jump at 20000 ft");
		System.out.println("Instruction:Always be prepared for everything and don't panic");
		
		
	}
	@After("execution(public void Display())")
	
	public void AfterDisplay() {
		

		System.out.println("YOUR FEEDBACK ABOUT SKYDIVING");
		System.out.println("PLEASE RATE US! THAKYOU");
	}
	
	
	
	

}
