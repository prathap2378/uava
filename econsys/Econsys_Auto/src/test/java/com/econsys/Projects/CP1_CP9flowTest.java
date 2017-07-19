package com.econsys.Projects;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.econsys.TestData.Workbook;

public class CP1_CP9flowTest  {
	static Workbook wb=new Workbook();
	Logger log = Logger.getLogger(CP1_CP9flowTest.class.getName());
	//Green path1
	@Test(priority=0)
	public void greenPathflow() throws Exception {
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		String e_Size = wb.getXLData(20, 6, 1);
		String location =  wb.getXLData(20, 7, 1);
		
		Monorail.monorailTestFlow(e_Size,location);
		System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());
	}
	
	//Red path(invocationCount = 1,threadPoolSize = 1)
	@Test(priority=1)
	//invocationCount = 10,threadPoolSize = 1
	public void redPathflow() throws Exception {
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		String e_Size = wb.getXLData(20, 4, 1);
		String location =  wb.getXLData(20, 5, 1);
		
		Monorail.monorailTestFlow(e_Size,location);
		System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());
	}
	//Amber path
	@Test(priority=2)
	public void amberPathflow() throws Exception {
		System.out.printf("%n[START] Thread Id : %s is started!", Thread.currentThread().getId());
		String e_Size = wb.getXLData(20, 8, 1);
		String location =  wb.getXLData(20, 9, 1);

		Monorail.monorailTestFlow(e_Size,location);
		System.out.printf("%n[END] Thread Id : %s", Thread.currentThread().getId());
	}
}
