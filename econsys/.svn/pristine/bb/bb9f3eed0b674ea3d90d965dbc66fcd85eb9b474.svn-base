package adminpage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.UIobjectrepositary.in.RtqFormUIodj;
import com.monorail.Genriclibrery.CommonUtils;
import com.monorail.Genriclibrery.Driver;
import com.testdata.in.Workbook;

public class RTQsave extends Driver{
	RtqFormUIodj nrtq=PageFactory.initElements(Driver.driver(), RtqFormUIodj.class);
	CommonUtils cu=PageFactory.initElements(Driver.driver(), CommonUtils.class);
	
	static Workbook wb=new Workbook();
	Login login=new Login();
	
	String prjname;
	String Customer;
	String Consultant;
	String location=null;
	String projectAddress=null;
	String size=null;
	double points;
	String productSpecified;
	String typeofBuilding;
	String endUserIndustrySector;
	String typeofProject;
	String enquiryFormat;
	String documentationReceived;
	String areweNamedSpecified;
	String haveweworkedonthissitebefore;
	String termsandconditionsadvised;
	String pCG;
	String performanceBond;
	

	public static void main(String[] args) {
		RTQsave rtq=new RTQsave();
		try {
			int n=4;
			rtq.login();
			for(int i=0;i<=n;i++){
				rtq.rtqform();
				
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void login() throws IOException, InterruptedException{
		String url=wb.getXLData(1, 3, 0);
		login.url(url);
		
		String un=wb.getXLData(1,0, 0);
		String pwd=wb.getXLData(1, 1, 0);
		login.user(un,pwd);
	}
	//******RTQ form inputs******
		@SuppressWarnings("resource")
		public void rtqform() throws InterruptedException, IOException {
		  
			
			
		 
		  
		  String XLpath=PropertiesUtil.getPropValues("Path_TestData");
		  
		  FileInputStream file = new FileInputStream(XLpath);
		  HSSFWorkbook wb1 = new HSSFWorkbook(file);
		  int sheetname=3;
		  HSSFSheet sheet=wb1.getSheetAt(sheetname);
		 			 
		  Iterator<Row> rowIterator = sheet.rowIterator();	
			
		  while(rowIterator.hasNext()){
			HSSFRow row = (HSSFRow) rowIterator.next();
			int rowNum = row.getRowNum();
			
			/*Iterator<Cell> cellIterator=row.cellIterator();
			
			while(cellIterator.hasNext()){
			Cell cell=cellIterator.next();	
			
			System.out.println("cell values are"+cell);
			}*/
			if (rowNum != 0) {
				prjname = row.getCell(0).getStringCellValue();
	       
	         	Customer = row.getCell(1).getStringCellValue();
	         	
	         	Consultant = row.getCell(2).getStringCellValue();

	         	projectAddress = row.getCell(3).getStringCellValue();
	         	size = row.getCell(4).getStringCellValue();
	         	points = row.getCell(5).getNumericCellValue();
	         	productSpecified = row.getCell(6).getStringCellValue();
	         	typeofBuilding = row.getCell(7).getStringCellValue();
	         	endUserIndustrySector = row.getCell(8).getStringCellValue();
	         	typeofProject = row.getCell(9).getStringCellValue();
				enquiryFormat = row.getCell(10).getStringCellValue();
				documentationReceived = row.getCell(11).getStringCellValue();
				areweNamedSpecified = row.getCell(12).getStringCellValue();
				location = row.getCell(13).getStringCellValue();
				haveweworkedonthissitebefore = row.getCell(14).getStringCellValue();
				termsandconditionsadvised = row.getCell(15).getStringCellValue();
				pCG = row.getCell(16).getStringCellValue();
				performanceBond = row.getCell(17).getStringCellValue();
			}
			
			 driver().findElement(By.linkText("New RTQ")).click();
			  driver().manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		  //String prjname=wb.getXLData(4, 3);
		  nrtq.getProjectName().sendKeys(prjname);
		  nrtq.getProjectAddres().sendKeys(projectAddress);
		  nrtq.getConsultantName().sendKeys(Consultant);
		  nrtq.getCustomerName().sendKeys(Customer);
		  
		  cu.selectByVisibleText(nrtq.getEstimatedSize(), size);
		  
		  nrtq.getPoints().sendKeys(""+points);
		  
		  cu.selectByVisibleText(nrtq.getProductSpecifieddd(), productSpecified);
		  
		  cu.selectByVisibleText(nrtq.getTypeofBuildingdd(), typeofBuilding);
		  
		  cu.selectByVisibleText(nrtq.getEndUserIndustrySectordd(), endUserIndustrySector);
		  
		  cu.selectByVisibleText(nrtq.getTypeofProjectdd(), typeofProject);
		  
		  cu.selectByVisibleText(nrtq.getEnquiryFormatdd(), enquiryFormat);
		  
		  cu.selectByVisibleText(nrtq.getDocumentationReceiveddd(), documentationReceived);
		  
		  cu.selectByVisibleText(nrtq.getGANameddd(), areweNamedSpecified);
		  
		  cu.selectByVisibleText(nrtq.getLocationdd(), location);
		  
		  Select Haveweworked=new Select(nrtq.getPreviousExperienceAtSitedd());
		  Haveweworked.selectByVisibleText(haveweworkedonthissitebefore);
		  
		  Select Termsandconditionsadvised=new Select(nrtq.getTermsConditionsAdviseddd());
		  Termsandconditionsadvised.selectByVisibleText(termsandconditionsadvised);
		  
		  Select PCG=new Select(nrtq.getPCGdd());
		  PCG.selectByVisibleText(pCG);
		  
		  Select PerformanceBond= new Select(nrtq.getPerformanceBond());
		  PerformanceBond.selectByVisibleText(performanceBond);
		  
		  /*Select IstheEnquiryOpentoall=new Select(nrtq.getIsenqueryopentoall());
		  IstheEnquiryOpentoall.selectByVisibleText("Yes");*/
		  
		 /* Thread.sleep(2000);
		  nrtq.getUploaddocument().sendKeys("D:\\Softwares\\eclipse\\Selenium\\Monorail\\DocsMonorailAutomation\\G1 Gateway Approval.doc");*/
		  
		  nrtq.getComments().sendKeys("RTQ form ");
		  nrtq.getSave().click();
		  /*nrtq.getSubmit().click();*/
		  }
		
		  	  //Yes - Outright
		
		  
		  
		  
	  }
		
		/*@SuppressWarnings("resource")
		public String getexcell(int row,int cell) throws IOException{
			String xlpath="";
			FileInputStream file=new FileInputStream(xlpath);
			HSSFWorkbook wb=new HSSFWorkbook(file);
			Sheet sheet=wb.getSheetAt(0);
			Row rowre=sheet.getRow(row);
			Cell cellre=rowre.getCell(cell);
			String cellvalue=cellre.toString();
			System.out.println(cellre);
			return cellvalue;
		}*/
		
		void setexcel() throws FileNotFoundException{
			String xlpath="";
			FileOutputStream setdata=new FileOutputStream(xlpath);
			HSSFWorkbook wb=new HSSFWorkbook();
			HSSFSheet sheet=wb.createSheet("mysheet");
			
			//This data needs to be written (Object[])
	        Map<String, Object[]> data = new TreeMap<String, Object[]>();
	        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
	        data.put("2", new Object[] {1, "Amit", "Shukla"});
	        data.put("3", new Object[] {2, "Lokesh", "Gupta"});
	        data.put("4", new Object[] {3, "John", "Adwards"});
	        data.put("5", new Object[] {4, "Brian", "Schultz"});
	          
		}
		

	
}
