package com.mara.sql;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class RegisterHandler {
	private String user_Name = "root";
	private String user_Password = "";
	private String user_URL = "jdbc:mysql://localhost:3306/uava";
	static void register(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
