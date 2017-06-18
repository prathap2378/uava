package com.mara.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class MysqlConnection {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//insertdata("Joe","Joe@mara.com","mara1");
	}
	public static Connection getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		String user_Name = "root";
		String user_Password = "";
		String user_URL = "jdbc:mysql://localhost:3306/uava";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection(user_URL, user_Name, user_Password);
		System.out.println("connected");
		return conn;
	}
	
	public static void selectFromdatabase(){
		try {
		Statement st = getConnection().createStatement();
		
		ResultSet rs = st.executeQuery("select * from student");
		System.out.println("executed");
		while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		getConnection().close();
	} catch (Exception e) {
		System.out.println(e);
	}
	}
   
   public static void insertdata(String name,String email, String pwd) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{

	   PreparedStatement statement = (PreparedStatement) getConnection().prepareStatement("insert into student(name,email,pass) values (?,?,?)");
	   statement.setString(1, name);
	   System.out.println("name = "+name);
	   statement.setString(2, email);
	   statement.setString(3, pwd);
	   System.out.println("pwd = "+pwd);
	   statement.execute();
	   statement.close();
	   getConnection().close();
	   System.out.println("worked...");
   }
}
