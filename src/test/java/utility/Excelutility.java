package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility {
	public static String getCellValue(String xl1,String Sheet1,int r,int c)
	{
		try
		{
			FileInputStream fi=new FileInputStream(xl1);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFCell cell=wb.getSheet(Sheet1).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
		}
		catch(Exception e)
		{
		return "";
		}
		
	}
	
public static int getRowCount(String xl1,String Sheet1)
{
	try
	{
		FileInputStream fi=new FileInputStream(xl1);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		return wb.getSheet(Sheet1).getLastRowNum();
	}
	catch(Exception e)
	{
	return 0;
	}
	
}
}
