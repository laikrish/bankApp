package com.capgemini.bankapp.database;

import java.util.HashSet;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.model.Customer;
import java.time.LocalDate;

public class DummyDataBase {

	public DummyDataBase() {
		// TODO Auto-generated constructor stub
		
	}
	public static HashSet<BankAccount> bankData = new HashSet<>();
	public static HashSet<Customer> customerData = new HashSet<>();

	static
	{
		BankAccount b1 = new BankAccount(2024, 100, "SAVINGS");
		BankAccount b2 = new BankAccount(2025, 100, "CURRENT");
		BankAccount b3 = new BankAccount(2026, 100, "SAVINGS");
		BankAccount b4 = new BankAccount(2023, 100, "CURRENT");
		
	
		bankData.add(b1);
		bankData.add(b2);
		bankData.add(b3);
		bankData.add(b4);
		
		customerData.add(new Customer("Keerthana", 1111, "keerthana", "keerthana@gmail.com", "Guntur", LocalDate.parse("1997-09-22"),b1));
		customerData.add(new Customer("Swathi", 1112, "swathi", "swathi@gmail.com", "Rajamundry", LocalDate.parse("1996-07-23"),b2));
		customerData.add(new Customer("Chaitanya", 1113, "chaitanya", "chaitanya@gmail.com", "Hyderabad", LocalDate.parse("1997-08-02"),b3));
		customerData.add(new Customer("George", 1114, "george", "george@gmail.com", "Mumbai", LocalDate.parse("1996-07-24"),b4));
		
	}
	
}