package jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddNewEmployeeDetails2 {
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driver,url,userName,password;
	driver="com.mysql.cj.jdbc.Driver";//driver class present in this 
	url ="jdbc:mysql://localhost:3306/db11223";
	userName = "root";
	password ="root";
	String SELECT = "select*from employee";
	
	//1.loading driverClass
	//it is optional from java 1.5v
	Scanner in = new Scanner(System.in);
	System.out.println("Please enter  employee id");
	int eid = in.nextInt();
	
	System.out.println("Please enter employee name");
	String ename = in.next();
	
	System.out.println("Please enter employee salary");
	int esal = in.nextInt();
	
	String INSERT = "insert into employee values(?,?,?)";
	
	Class.forName(driver);
	
	//2.Establish connection
	Connection con =DriverManager.getConnection(url,userName,password);
	
	//3. Create statement /preparedStatement/callableStatement object
	 PreparedStatement ps = con.prepareStatement(INSERT);
	 ps.setInt(1,eid);
	 ps.setString(2, ename);
	 ps.setInt(3, esal);
	 
	 int status = ps.executeUpdate();
	 if(status>=1) {
		 System.out.println("new employee added successfully!");
	 }else {
		 System.out.println("something is wrong!!");
	 }

 
	     //5.close resources
	     ps.close();
	     con.close();
}
}
