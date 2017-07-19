package com.econsys.Genriclibrery;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.regexp.RE;

import com.econsys.TestData.Workbook;

public class DBConnection {
	 // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://10.0.0.16:3306/monorail_V3";
	   ///?user=root
	   static int sell;
	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
	System.out.println(sell_Value_SmallWorks());
	readFROMExcel();
	//emailConfiguration();
}

public static int sell_Value_SmallWorks(){

	Connection con;
	
	try {
		//STEP 2: Register JDBC driver 
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(DB_URL, USER, PASS);

		Statement stmt;
		String query = "SELECT maxSmallWorksValue FROM monorail_V3.MONORAILVERBALSETTINGS";
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		if(rs.next()){
		sell = rs.getInt("maxSmallWorksValue");
		//System.out.println(sell);
		}
		
		//STEP 6: Clean-up environment
	    rs.close();
	    stmt.close();
	    con.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return sell;
	
}
public static String readFROMExcel() throws IOException, ClassNotFoundException, SQLException{
	DBConnection db = new DBConnection();
	String subjetExcel = null;
	//Reading cost and sell values
	 String filepath = System.getProperty("user.dir");
	 String testdataXLpath=filepath+"\\src\\main\\java\\com\\econsys\\TestData\\Monorail_testdata.xls";
	 FileInputStream file = new FileInputStream(testdataXLpath);
	 HSSFWorkbook wb1 = new HSSFWorkbook(file);
	 int sheetNumber = 4;
	 HSSFSheet Firstpage=wb1.getSheetAt(sheetNumber);
	  
	 //String subject = Firstpage.getRow(2).getCell(1).getStringCellValue();
		  
	 Iterator rowIterator = Firstpage.rowIterator();	
			
	 while(rowIterator.hasNext()){
	 HSSFRow row = (HSSFRow) rowIterator.next();
	 
	 int rowNum = row.getRowNum();
	 boolean n = row.getCell(1)!=null;
	 //boolean n1 = row.getCell(1).getStringCellValue()!=null;
		 if (rowNum !=0&&n) {
			 subjetExcel = row.getCell(1).getStringCellValue();
			 
			 if(subjetExcel.equals(emailConfiguration())){
				 System.out.println("Yes equal");	 
			 }
			 else{
				 System.out.println("Not equal");
			 }
		 }
   }
	 System.out.println("sub excel");
	return subjetExcel;
}
public static String emailConfiguration() throws ClassNotFoundException, SQLException{
	String subjectDB = null;
	Connection con;
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection(DB_URL, USER, PASS);
	Statement stmt;
	String query = "select * from monorail_V3.NODEEMAILCONFIG";
	//createStatement();
	stmt=con.prepareStatement(query);
	ResultSet rs = stmt.executeQuery(query);
	
	while(rs.next()){
		subjectDB = rs.getString("subject");
		//System.out.println(subjectDB);	
		/*String sub = rs.getString(1);
		
		System.out.println(sub);*/
		}
	System.out.println("sub");
	return subjectDB;
}
	
}
