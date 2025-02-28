package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class Jdbcdatabase {

	public static void main(String[] args) {
		//providing the connection details
		String db_url="jdbc:mysql://localhost:3306";
		String username="root";
		String pass="root";
		//establish the connection
		try {
			Connection connection=DriverManager.getConnection(db_url, username, pass);
			//perform the operation
			String createDB="create database JDBC_DEMO";
			String useDB="use JDBC_DEMO";
			String createTable="create table JDBC_DEMO(empcode int UNIQUE,empname varchar(20) NOT NULL,empage int, easlary decimal(10,2))";
			String insertvalue1=" insert into JDBC_DEMO VALUES(101,'JENNY',25,10000.00)";
			String insertvalue2=" insert into JDBC_DEMO VALUES(102,'JACKY',30,20000.00)";
			String insertvalue3=" insert into JDBC_DEMO VALUES(103,'JEO',20,40000.00)";
			String insertvalue4=" insert into JDBC_DEMO VALUES(104,'JOHN',40,80000.00)";
			String insertvalue5=" insert into JDBC_DEMO VALUES(105,'SHAMEER',25,90000.00)";
			
			String select="SELECT *FROM jdbc_DEMO";
			Statement sm= connection.createStatement();
			sm.execute(createDB);
			sm.execute(useDB);
			sm.execute(createTable);
			sm.executeUpdate(insertvalue1);
			sm.executeUpdate(insertvalue2);
			sm.executeUpdate(insertvalue3);
			sm.executeUpdate(insertvalue4);
			sm.executeUpdate(insertvalue5);
			
			ResultSet result=sm.executeQuery(select);
			while(result.next()) {
				System.out.println(result.getInt("empcode")+ result.getString("empname")+result.getInt("empage")+result.getInt("easlary"));
				
			}
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
