package db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.testdata.in.Workbook;

public class DB {
	Workbook wb=new Workbook();
	 private static Logger log = Logger.getLogger(DB.class.getName());
			
	// Connection object
	static Connection con = null;
	// Statement object
	private static Statement stmt;
		 
	  @BeforeMethod
public void setconnection() throws IOException {
		  DOMConfigurator.configure("log4j.xml");
		
		//*************Database details******
		
		// Constant for Database URL
		String DB_URL=wb.getXLData(54, 0, 0);
		// Constant for Database Username
		String DB_USER = wb.getXLData(57, 0, 0);
		// Constant for Database Password
		String DB_PASSWORD = wb.getXLData(60, 0, 0);
		
		try{
	   		   // Make the database connection
	           String dbClass = "com.mysql.jdbc.Driver";
               Class.forName(dbClass).newInstance();
               // Get connection to DB
               con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
               log.info("Log in with url************"+DB_URL);
               log.info("Log in with User************"+DB_USER);
               log.info("Log in with Password************"+DB_PASSWORD);
               // Statement object to send the SQL statement to the Database
               stmt = con.createStatement();
               }
	    	   catch (Exception e)
              {
               e.printStackTrace();
               log.info("DB"+e);
               }
		       }

      @Test
public void test() {
		    	   
    	   try{
  		  
  		   	   String RULEELEMENTS=wb.getXLData(40, 0, 0);
    		   String MARGINCONFIGURATION=wb.getXLData(41, 0, 0);
    		   String MONORAILGRIDROWSMASTER=wb.getXLData(42, 0, 0);
    		   String POSSIBLEVALUES=wb.getXLData(43, 0, 0);
    		   String POSSIBLERANGE=wb.getXLData(44, 0, 0);
    		   String Ruletype=wb.getXLData(45, 0, 0);
    		   String MONORAILGATEWAYDETAILS=wb.getXLData(46, 0, 0);
    		   String PROCESSVARIABLES=wb.getXLData(47, 0, 0);
    		   
    		   
    		int Ruletypes = stmt.executeUpdate(Ruletype);
    		    log.info("Inserted Ruletypes**************"+Ruletypes);
  		   	
    		int RULEELEMENT = stmt.executeUpdate(RULEELEMENTS);
  				log.info("Inserted RULEELEMENTS**************"+RULEELEMENT);
  		  	
  			int POSSIBLERANGEs = stmt.executeUpdate(POSSIBLERANGE);
  		  		log.info("Inserted POSSIBLERANGE**************"+POSSIBLERANGEs);
  			
  		  	int POSSIBLEVALUE= stmt.executeUpdate(POSSIBLEVALUES);
  				log.info("Inserted POSSIBLEVALUES**************"+POSSIBLEVALUE);
  			
  			int MARGINCONFIGURATIONs = stmt.executeUpdate(MARGINCONFIGURATION);
  				log.info("Inserted MARGINCONFIGURATION**************"+MARGINCONFIGURATIONs);
  			
  			int MONORAILGRIDROWSMASTERs = stmt.executeUpdate(MONORAILGRIDROWSMASTER);
  				log.info("Inserted MONORAILGRIDROWSMASTER**************"+MONORAILGRIDROWSMASTERs);
  				
  			/*int MONORAILGATEWAYDETAILSs = stmt.executeUpdate(MONORAILGATEWAYDETAILS);
  				log.info("Inserted MONORAILGATEWAYDETAILSs**************"+MONORAILGATEWAYDETAILSs);
  				
  			int PROCESSVARIABLESs = stmt.executeUpdate(PROCESSVARIABLES);
  				log.info("Inserted PROCESSVARIABLESs**************"+PROCESSVARIABLESs);*/
  		
  		   
		   }
		   catch(Exception e)
		   {
		   e.printStackTrace();
		   }   
		    		                
      		}
  
      @AfterMethod
public void removeconnection() throws SQLException {

    	  if (con != null) {
		  con.close();
		  
    	  					}

      		}
}
