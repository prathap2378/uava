package com.econsys.TestData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.econsys.Projects.*;

public class Workbook {
	
	private static Logger log = Logger.getLogger(Login.class.getName());
	String filepath=System.getProperty("user.dir");
	HSSFSheet Firstpage=null;
	public String setcellvalue=null;
	//Method for Getting last Row number
		public int getrowNum(int sheetName){
			int rownum=0;
			try {
			String testdataXLpath=filepath+"//src//com//econsys//TestData//Monorail_testdata.xls";
			FileInputStream file = new FileInputStream(testdataXLpath);
				HSSFWorkbook wb = new HSSFWorkbook(file);
				rownum=wb.getSheetAt(sheetName).getLastRowNum();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return rownum;
		}
		
	
	public String getXLData(int rownum, int ceelnum,int sheetname) throws IOException{
	
		    //The configering from the log4j xml file
		    //DOMConfigurator.configure("log4j.xml");
		  
			//file path from properties file
			//String xlpath=PropertiesUtil.getPropValues("Path_TestData");
			String testdataXLpath=filepath+"//src//com//econsys//TestData//Monorail_testdata.xls";
			//File intilization
			FileInputStream file = new FileInputStream(testdataXLpath);
		    /*if(file.equals(true)){
			log.info("excel file exists: "+file);
			}
			else{
			log.info("excel file does not exists: "+file);
			}*/
			//Converting file as work book
			HSSFWorkbook wb = new HSSFWorkbook(file);
			//Getting sheet from work book
			HSSFSheet Firstpage=wb.getSheetAt(sheetname);
			log.info("Sheet name : "+wb.getSheetAt(0));
			String cellvalue = "";
		    HSSFRow hssfRow = Firstpage.getRow(rownum);
	
		    if(hssfRow!=null){
				HSSFCell cell = hssfRow.getCell(ceelnum);
				if(cell!=null){
					cell.setCellType(cell.CELL_TYPE_STRING);
					cellvalue = cell.getStringCellValue();
				}else{
					System.out.println("Cell null");
					System.out.println("Row Num :"+rownum);
					System.out.println("Cell Num :"+ceelnum);
					System.out.println("Sheet Num :"+sheetname);
				}
			}else{
				System.out.println("Row null");
				System.out.println("Row Num :"+rownum);
				System.out.println("Cell Num :"+ceelnum);
				System.out.println("Sheet Num :"+sheetname);
			}
			
			return cellvalue;
						
		}
	
	/*public double getXLDataint(int rownum, int ceelnum,int sheetname) throws IOException{
		
		//The configering from the log4j xml file
		  DOMConfigurator.configure("log4j.xml");
		//file path from properties file
	      String testdataXLpath=filepath+"//src//com//testdata//in//Monorail_testdata.xls";
		//File intilization
		  FileInputStream file = new FileInputStream(testdataXLpath);
			if(file.equals(true)){
			log.info("excel file exists: "+file);
			}
			else{
			log.info("excel file does not exists: "+file);
			}
			//Converting file as work book
			HSSFWorkbook wb = new HSSFWorkbook(file);
			//Getting sheet from work book
			HSSFSheet Firstpage=wb.getSheetAt(sheetname);
			log.info("Sheet name : "+wb.getSheetAt(0));
			double cellvalue= Firstpage.getRow(rownum).getCell(ceelnum).getNumericCellValue();
			return cellvalue;
		}*/
	
	public void setXLData( int rownum, int ceelnum,int sheetnum) throws IOException{
		//The configering from the log4j xml file
		  DOMConfigurator.configure("log4j.xml");
		//file path from properties file
		String XLpath=PropertiesUtil.getPropValues("Path_TestoutputData");
	    //File intilization
		FileOutputStream file = new FileOutputStream(XLpath);
		//Converting file as work book
		HSSFWorkbook wb = new HSSFWorkbook();
		//Getting sheet from work book
		HSSFSheet sheet=wb.getSheetAt(sheetnum);
		//Get cell from sheet
		HSSFCell cell=sheet.getRow(rownum).getCell(ceelnum);
		cell.setCellValue(setcellvalue);
		//print cell value
		System.out.println(setcellvalue);
		//wright to excel
		FileOutputStream outfile = new FileOutputStream(XLpath);
		wb.write(outfile);
    	}
    }


