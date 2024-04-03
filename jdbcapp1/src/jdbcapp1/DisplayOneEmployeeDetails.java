package jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayOneEmployeeDetails {
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driver,url,userName,password;
	driver="com.mysql.cj.jdbc.Driver";//driver class present in this 
	url ="jdbc:mysql://localhost:3306/db11223";
	userName = "root";
	password ="root";
	String SELECT = "select*from employee where esal>=55000";
	
	//1.loading driverClass
	//it is optional from java 1.5vDisplayEmployeeDetails.java
	Class.forName(driver);
	
	//2.Establish connection
	Connection con =DriverManager.getConnection(url,userName,password);
	
	//3. Create statement /preparedStatement/callableStatement object
	 Statement st = con.createStatement();
	 
	 //4.Excute query
	     ResultSet rs=st.executeQuery(SELECT);
	     
	     while(rs.next()) {
	          System.out.println(rs.getInt("eid")+"t"+rs.getString("ename")+"t"+rs.getInt("esal"));
	
}
	     //5.close resources
	     st.close();
	     con.close();
}
}
