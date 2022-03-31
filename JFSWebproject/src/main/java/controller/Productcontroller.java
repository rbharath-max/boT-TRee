package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.Productdetails;

public class Productcontroller {
	public  List<Productdetails> findAllproducts()throws ClassNotFoundException,SQLException{
	     
	     List<Productdetails> productList=new ArrayList<Productdetails>();
	     ResultSet resultset=jdbcConnection.getResultSet();
	     while(resultset.next()) {
	    	 System.out.println(resultset.getInt("pid")+"\t"+resultset.getString("pname")+"\t"+resultset.getInt("price")+"\t"+resultset.getInt("offer"));
	     
	     
	     
	     
	     int pid=resultset.getInt("pid");
	     String pname=resultset.getString("pname");
	     int price=resultset.getInt("price");
	     int offer=resultset.getInt("offer");
	     productList.add(new Productdetails(pid,pname,price,offer));
	     } 
	     
	     return productList;
	}

}
