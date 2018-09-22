package com.capgemini.day11.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
	public static void main(String[] args) {
		
		String dburl = "jdbc:mysql://85.10.205.173:3306/clud2_na";
		String username = "cloud2_na";
		String password = "cloud2_na";
		
		try  {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try (Connection connection = DriverManager.getConnection(dburl, username, password)) {
				if(connection != null)
					System.out.println("--connected -- ");
			}
			catch(SQLException e) {
				e.printStackTrace();
				System.out.println("-- failed to connect --");
			}
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver class not found.");
			e.printStackTrace();
		}
	}
}