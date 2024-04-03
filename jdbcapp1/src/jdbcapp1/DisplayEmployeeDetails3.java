package jdbcapp1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayEmployeeDetails3 {
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driver,url,userName,password;
	driver="com.mysql.cj.jdbc.Driver";//driver class present in this 
	url ="jdbc:mysql://localhost:3306/db11223";
	userName = "root";
	password ="root";

String procedure = "{call getAllEmployees()}";
	
	//1.loading driverClass
	//it is optional from java 1.5v
	Class.forName(driver);
	
	//2.Establish connection
	Connection con =DriverManager.getConnection(url,userName,password);
	
	//3. Create statement /preparedStatement/callableStatement object
     CallableStatement cs = con.prepareCall(procedure);
 
	 
	 //4.Excute query
	     ResultSet rs=cs.executeQuery();
	     
	     while(rs.next()) {
	          System.out.println(rs.getInt("eid")+" "+rs.getString("ename")+" "+rs.getInt("esal"));
	
}
	     //5.close resources
	     cs.close();
	     con.close();
}
}
