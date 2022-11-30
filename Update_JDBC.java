package com_student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update_JDBC {

	public static void main(String[] args) {
		 try {
			 	Class.forName("com.mysql.cj.jdbc.Driver");//registering my sql driver
			 	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","23October1999sd@#");//connection
				Statement stmt=con.createStatement(); 
				//updating and executing records
				stmt.executeUpdate("update student_mangage set s_add='WestBengal' where s_id=1");
				stmt.executeUpdate("delete from student_mangage where s_id=2");
				ResultSet rs=stmt.executeQuery("select * from student_mangage");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));			
	}
				con.close();
		 }
catch(Exception e) {
	e.printStackTrace();
}
	}

}