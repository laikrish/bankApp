package com.capgemini.day11.client;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.capgemini.day11.util.DbUtil;

public class CrudOperations {
	public static void main(String[] args) {
		String query = "INSERT INTO customer VALUES(?,?,?,?,?,?,?)";
		String query1 = "INSERT INTO bankAccount VALUES(?,?,?,?)";
		//String query = "UPDATE cutsomers SET customer_name= ? WHERE customer_id = ?";
		//String query = "DELETE FROM customers WHERE customer_id = ?";
		//String query = "SELECT * FROM customers";

		
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query); 
				PreparedStatement statement1 = connection.prepareStatement(query1); 
				/*ResultSet result = statement.executeQuery()*/) { 
			
			/*while(result.next()) {
				System.out.println(result.getInt(1) + "\t" + result.getString(2) + "\t" + result.getDate(3).toLocalDate());
			}		*/
			
			
			statement.setString(1, "Keerthana");
			statement.setInt(2, 1111);
			statement.setString(3, "keerthana");
			statement.setString(4,"keerthana@gmail.com");
			statement.setString(5,"Guntur");
			statement.setDate(6, Date.valueOf(LocalDate.now()));
			statement.setString(7,"b1");
			
			
			statement1.setInt(1, 2024);
			statement1.setInt(2, 1111);
			statement1.setDouble(3,100);
			statement1.setString(4, "SAVINGS");
			
			
			
			if(statement.executeUpdate() != 0 && statement1.executeUpdate() != 0)
				System.out.println("Record inserted successfully");  
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}


	
	/*public Customer authenticateCustomer(Custome customer) {
		
		String query = "SELECT * FROM customers WHERE customer_id = ? AND customer_password = ?";
		
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			
			if(result.next()) {
				customer.setEmail(result.getString(3))
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}*/
 