package jdbcapp1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;




public class BatchProcessing {


public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String driver,url,userName,password;
	driver="com.mysql.cj.jdbc.Driver";//driver class present in this 
	url ="jdbc:mysql://localhost:3306/db11223";
	userName = "root";
	password ="root";
	
	String INSERT_QUERY1 = "insert into employee values(101,'Wills',55000)";
	String INSERT_QUERY2 = "insert into employee values(102,'Smith',55000)";
	String INSERT_QUERY3 = "insert into employee values(103,'Jones',55000)";
	String INSERT_QUERY4 = "insert into employee values(104,'Alice',55000)";
	String INSERT_QUERY5 = "insert into employee values(105,'Alex',55000)";


	
	//1.loading driverClass
		//it is optional from java 1.5vDisplayEmployeeDetails.java
		Class.forName(driver);
		
		//2.Establish connection
		Connection con =DriverManager.getConnection(url,userName,password);
		
		//3. Create statement /preparedStatement/callableStatement object
		//1.Loading driver class
		//It is optional from java 1.5v
		Class.forName(driver);
		
		//2.Establish connection 
		Statement st=con.createStatement();
		
		int status = st.executeUpdate(INSERT_QUERY1);
		if(status >=1 ) {
			System.out.println("new employee add successfully!");
		}else {
			System.out.println("some thing is wrong!!!");
		}
		st.addBatch(INSERT_QUERY2);
		st.addBatch(INSERT_QUERY3);
		st.addBatch(INSERT_QUERY4);
		st.addBatch(INSERT_QUERY5);
		int[] results = st.executeBatch();
		
		for (int result : results) {
		    System.out.println("Executed " + result + " rows.");
		}
		
		con.close();
		st.close();
		}
}

