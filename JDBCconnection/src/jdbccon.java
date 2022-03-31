import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;  


public class jdbccon {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/employee";
		String username="root";
		String password="root";
		String query="  select * from empdeta;";
		
		
		
		
		
	
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection(url, username, password);
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		String name;
		int id;
		
		int salary;
		System.out.println("Id"+"\t"+"Name"+"\t"+"\t"+"Salary");
		System.out.println("-------------------------------------------------------------------");
		while (rs.next()) 
		{
			name=rs.getString("ename");
			id=rs.getInt("eid");
			String dep=rs.getString("dept");
			salary=rs.getInt("salary");
	
		System.out.println(id+"\t"+name+"\t"+"\t"+salary);
		}
		System.out.println("-------------------------------------------------------------------");
		st.close();
		con.close();
		
		
		
	}

}
