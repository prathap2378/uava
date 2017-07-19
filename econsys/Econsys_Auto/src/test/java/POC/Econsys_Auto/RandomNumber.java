package POC.Econsys_Auto;

import java.io.IOException;
import java.util.Random;

import com.econsys.TestData.Workbook;

public class RandomNumber {
	static Workbook wb = new Workbook();
	public static void main(String[] args) throws IOException {
		RandomNumber.randumNumber1();
	}
	public int randumNumber(){
		   Random rand = new Random();
		   int num = rand.nextInt(9000000) + 1000000;
		   
		   return num;
}
	public static String randumNumber1() throws IOException{
		Random rand = new Random();
		int num1 = rand.nextInt(100);
		//System.out.println(num1);
		
		int count1=0;
		count1++;
		
		wb.setExcelData(1, 1, 3, ""+count1++);
		String c = wb.getXLData(1,3,1);
		
		return c;
	}
	
}
