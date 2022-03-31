package Collection;

import java.util.Scanner;

public class JavaExceptionExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number");
		
		try {
			int n=s.nextInt();
			System.out.println(n);
		}catch (Exception e) {
			System.out.println("enter numbers alone no letters");
			
		}
		 
	}

}
