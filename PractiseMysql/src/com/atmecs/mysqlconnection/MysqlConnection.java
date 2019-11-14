package com.atmecs.mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlConnection {
	public static void main(String args[]) throws Exception {
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student?autoReconnect=true&useSSL=false?user=root&password=admin@123");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from stu");
			System.out.println("connection established");
			while(rs.next()) {
				String s=rs.getString(1);
				System.out.println(s);
			}
				
			con.close();
			}
}
