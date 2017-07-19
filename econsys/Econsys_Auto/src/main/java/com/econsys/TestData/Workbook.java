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



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.econsys.Projects.*;

public class Workbook {
	
	private static Logger log = Logger.getLogger(Workbook.class.getName());
	String filepath=System.getProperty("user.dir");
	String testdata_ExcelPath=filepath+"//src//main//java//com//econsys//TestData//Monorail_testdata.xls";
	HSSFSheet Firstpage=null;
	public String setcellvalue=null;
	
	//Method for Getting last Row number
	public int getrowNum(int sheetName){
			int rownum=0;
			try {
			
			FileInputStream file = new FileInputStream(testdata_ExcelPath);
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
	
			//File intilization
			FileInputStream file = new FileInputStream(testdata_ExcelPath);
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
			//log.info("Sheet name : "+wb.getSheetAt(0));
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
	
	public void setExcelData(int sheetNumber,int rowNum,int colNum,String Data) throws IOException{
		
		//File intilization*/
		FileInputStream file = new FileInputStream(testdata_ExcelPath);
		
		//Converting file as work book
	    HSSFWorkbook wb = new HSSFWorkbook(file);
		
	    //Getting sheet from work book
		HSSFSheet sheet=wb.getSheetAt(sheetNumber);
		
		//Get cell from sheet
		Row row =sheet.getRow(rowNum);
		Cell cell=row.createCell(colNum);
		
		cell.setCellValue(Data);
		
		//wright to excel
		FileOutputStream outfile = new FileOutputStream(testdata_ExcelPath);
		
		wb.write(outfile);
		wb.close();
		outfile.close();
    	}
	
	/*public void setExcelData(String sheetName,int rowNum,int colNum,String Data) throws Exception{
	
		FileInputStream fis=new FileInputStream(testdataXLpath);
		workbook=Workbook.create(fis);
		wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).setCellValue(Data);
		
		
	}
	*/
	public static void main(String[] args) throws IOException {
		Workbook workbook = new Workbook();
		workbook.getXLData(1, 3,0);
		workbook.setExcelData(1, 1, 2, "Proname");
	}
    }


