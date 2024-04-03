package jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddNewEmployeeDetails {
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driver,url,userName,password;
	driver="com.mysql.cj.jdbc.Driver";//driver class present in this 
	url ="jdbc:mysql://localhost:3306/db11223";
	userName = "root";
	password ="root";
	String INSERT = "insert into employee values(1234,'krish',65000)";
	
	//1.loading driverClass
	//it is optional from java 1.5v
	Class.forName(driver);
	
	//2.Establish connection
	Connection con =DriverManager.getConnection(url,userName,password);
	
	//3. Create statement /preparedStatement/callableStatement object
	 Statement st = con.createStatement();
	 
	 //4.Excute query
	 int status = st.executeUpdate(INSERT);
	 if(status>=1) {
		 System.out.println("new employee added successfully!");
	 }else {
		 System.out.println("something is wrong!!");
	 }


	     //5.close resources
	     st.close();
	     con.close();
}
}
