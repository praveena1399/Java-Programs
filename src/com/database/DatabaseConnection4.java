package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jnit";
		String username = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(url,username,password);
		PreparedStatement ps = connection.prepareStatement("insert into infosys values(?,?,?,?);");
		ps.setInt(1, 1000);
		ps.setString(2, "Matthew");
		ps.setInt(3, 20000);
		ps.setString(4, "Pune");
		ps.executeUpdate();
		
	}

}
