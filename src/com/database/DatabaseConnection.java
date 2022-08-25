package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 String url = "jdbc:mysql://localhost:3306/jnit";
		 String username = "root";
		 String password = "root";
		 Connection connection = DriverManager.getConnection(url,username,password);
		 Statement statement = connection.createStatement();
		 int x = statement.executeUpdate("insert into infosys values(1189,'Harry',12000,'Pune');");
		 if(x!=0) {
			 System.out.println("Record inserted");
		 }
	}

}
