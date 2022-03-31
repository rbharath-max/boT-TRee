package ShoppingCart;

import java.security.PublicKey;

import java.text.SimpleDateFormat;  
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductdDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c;
		int j=0;
		
		
		
		
		
		
		List<Product>arrlist=new LinkedList<Product>();
		arrlist.add(new Product("mouse", 600, 15));
		arrlist.add(new Product("monitor", 7000, 5));
		arrlist.add(new Product("keyboard", 2500, 3));
		
		do 
		{
			System.out.println("Choose any one to proceed"+'\n'+"1.buy"+'\n'+"2.Exit");
			 c = sc.nextInt();
			 
			 String pname;
			String l;
			switch(c) {
			 case 1:
				 for(Product i:arrlist) {
					 System.out.println(i);
				 }
				 
				 System.out.println("---------------------------------------------------------------------------------");
				 
				 System.out.println("enter the product name you wish to purchase");
				 pname=sc.next();
				 
				 
					 
					 
					 System.out.println("can we proceed further?");
					 
					 l=sc.next();
					 
					     if(l.equals("yes")) {
						 System.out.println("Cash on delivery or onlinepayment");
						 String a = sc.next();
						 if(a.equals("onlinepayment")) 
						 {
					     System.out.println("                     ");
					    
					   
						 
					     System.out.println("enter upi id:");
						 String upiString  = sc.next();
						 
						 for(Product i:arrlist)
						 {
							 
							 if(i.productname.equals(pname))
							 {
								 System.out.println("Your order is");
								 System.out.println("                        ");
								 
								 System.out.println("productname:"+i.productname+'\n'+"productprice:"+i.productprice);
								 
								 System.out.println("-------------------------------------------------------------------------");
								 System.out.println("thank you for ordering with us");
								 
							 }
						 }
							 
						 }
						 
						 
					 }
					 break;
					 
					 
			 case 2:
				 j=1;
				 break;
					 
					 
			
					 
				 
				 

			 }
		}while(j==0);
		sc.close();
	}
}
