package Helpers;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datahelper {
	
	HashMap<String,String> stroevalues= new HashMap<String,String>();
	
	public static List<HashMap<String,String>> data(String filename,String sheetname){
		
	List<HashMap<String,String>> mydata= new ArrayList();
	try {
		FileInputStream fis=new FileInputStream(filename);
		Workbook wbook= new XSSFWorkbook(fis);
		Sheet sheet= wbook.getSheet(sheetname);
		      Row headerrow =sheet.getRow(0);
		      for(int i=1;i<sheet.getPhysicalNumberOfRows(); i++){
		    	  Row currentrow=sheet.getRow(i);
		    	  HashMap<String,String> hash=new HashMap<String,String>();
		    	  
		    	 for(int j=0;j<currentrow.getPhysicalNumberOfCells();j++){
		    		 Cell currentcell=currentrow.getCell(j);
		    		 switch(currentcell.getCellType()){
		    		 case Cell.CELL_TYPE_STRING:
		    			 hash.put(headerrow.getCell(j).getStringCellValue(), currentcell.getStringCellValue());
		    		  
		    		 }
		    	 } 
		    	 mydata.add(hash);
		      }
		
			fis.close();
	} catch (Exception e) {
		
		e.printStackTrace();
	} 
	return mydata;
	}
	
	

}
