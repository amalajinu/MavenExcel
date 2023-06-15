package excelDemo;

import java.io.IOException;

import old.Excel;

public class ExcedlMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String a=ExcelRead.readStringData(0, 1);
		System.out.println("Value of a is "+a);
		
		String b=ExcelRead.readIntegerData(0, 0);
		 System.out.println("Value of b is "+b);
	}

}
