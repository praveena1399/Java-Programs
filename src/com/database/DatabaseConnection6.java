package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection6 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jnit";
		String username = "root";
		String password = "root";
		Connection connection = DriverManager.getConnection(url,username,password);
		PreparedStatement ps = connection.prepareStatement("delete from infosys where eid=?");
		ps.setInt(1, 1189);
		ps.executeUpdate();
		
	}
}
