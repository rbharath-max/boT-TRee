

import java.sql.*;
import java.util.Scanner;
public class JDBCConnectionModified {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
        Statement st=con.createStatement(); 
        String query1="insert into empdeta(eid,ename,dept,salary)values(?,?,?,?)";
        
        PreparedStatement pst=con.prepareStatement(query1);
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the eid:");
        int eid=sc.nextInt();
        System.out.println("enter the ename:");
        String ename=sc.next();
        System.out.println("enter dept");
        String dept=sc.next();
        System.out.println("enter the salary:");
        int salary1=sc.nextInt();
        sc.close();
        
        pst.setInt(1,eid);
        pst.setString(2,ename);
        pst.setString(3,dept);
        pst.setInt(4,salary1);
        
        
        
        int rows_affected_pst=pst.executeUpdate();
        System.out.println("Query ok, "+rows_affected_pst+"row affected");
//        int rows_affected=pst.executeUpdate("insert into empdeta(eid,ename,dept,salary)");
//        System.out.println("Query ok, "+rows_affected+"row affected");
      
             
		 
        System.out.println("Id"+"\t"+"Name"+"\t"+"\t"+"Salary");
		System.out.println("-------------------------------------------------------------------");
      
       ResultSet rs=st.executeQuery("select * from empdeta");
		while (rs.next()) 
		{
			String name = rs.getString("ename");
			int id = rs.getInt("eid");
			String dep=rs.getString("dept");
			int salary = rs.getInt("salary");
	
		System.out.println(id+"\t"+name+"\t"+"\t"+salary);
		}
		System.out.println("-------------------------------------------------------------------");
		st.close();
		con.close();
        
		

	}

}
