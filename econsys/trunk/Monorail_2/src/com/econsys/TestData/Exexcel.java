package com.econsys.TestData;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;


public class Exexcel {

	public static void main(String[] args) {
		
	    try{
	        FileInputStream fis=new FileInputStream(new File("D:\\Workspace\\Monorail_2\\src\\com\\econsys\\TestData\\Monorail_testdata.xls"));
	        HSSFWorkbook hssfWorkbook=new HSSFWorkbook(fis);
	        HSSFSheet hssfSheet=hssfWorkbook.getSheetAt(0);
	        Iterator<?> rowIterator = hssfSheet.rowIterator();


	        while(rowIterator.hasNext()){
	        	HSSFRow row = (HSSFRow) rowIterator.next();
	        	int rowNum = row.getRowNum();
	            if (rowNum >49 ) {
	            	Cell cell1 = row.getCell(0);
	            	Cell cell2 = row.getCell(1);
	            	Cell cell3 = row.getCell(2);
	            	Cell cell4 = row.getCell(3);
	            	
	            	String cell1Value = cell1.getStringCellValue();
	            	String cell2Value = cell2.getStringCellValue();
	            	String cell3Value = cell3.getStringCellValue();
	            	String cell4Value = cell4.getStringCellValue();
	            	
	            	
	            	
	            /*Iterator<Cell> cellIterator=row.iterator();
	            while(cellIterator.hasNext()){*/
	            
	                /*Cell cell2=cellIterator.next();
	                if(cell2.getCellType()==Cell.CELL_TYPE_STRING){
	                 System.out.println(cell2.getStringCellValue());
	                 arrayList.add(cell2.getStringCellValue());}*/  
	                }
	            }
	        

	        //System.out.println("Size of List::"+arrayList.size());
	     }catch(Exception ex){
	         System.out.println("Exception in Exel   creation"+ex.getMessage());            
	    }

	}

}
