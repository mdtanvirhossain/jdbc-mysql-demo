package example.jdbc_mysql.demo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCDemo {

  public static void main(String[] argv) {

	System.out.println("-------- MySQL JDBC Demo Connection ------------");

	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}

	System.out.println("MySQL JDBC Driver Registered!");
	Connection connection = null;

	try {
		connection = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/test_db","root", "root");

	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;
	}

	if (connection != null) {
		System.out.println("Welcome ! Mysql database successfully connected.");
	} else {
		System.out.println("Failed to make connection!");
	}
  }
}

