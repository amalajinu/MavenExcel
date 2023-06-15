package excelDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static XSSFSheet sh;
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static String readStringData(int i,int j) throws IOException
	{
		String path= System.getProperty("user.dir");
		System.out.println(path);
		f=new FileInputStream(path+"\\src\\main\\resources\\Test1.xlsx");
		//f=new FileInputStream("D:\\ecl\\javaobsqura\\MavenExcelDemo\\src\\main\\resources\\Test1.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		Row r=sh.getRow(i);
		Cell c =r.getCell(j);
		return c.getStringCellValue();
	}
	public static String readIntegerData(int i, int j)throws IOException{
		f=new FileInputStream("D:\\ecl\\javaobsqura\\MavenExcelDemo\\src\\main\\resources\\Test1.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		Row r=sh.getRow(i);
		Cell c =r.getCell(j);
		int a=(int)c.getNumericCellValue();
		return String.valueOf(a);
	}

}
