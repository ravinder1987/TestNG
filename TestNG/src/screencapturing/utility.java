package screencapturing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utility {

	public static String captureScreenshot(WebDriver ravi, String  screenshotName ) throws IOException{
		
	try{	TakesScreenshot sc1=(TakesScreenshot)ravi;
		File source= sc1.getScreenshotAs(OutputType.FILE);
		String dest= new String("D:\\seleniumclass\\screenshots\\ "+screenshotName+".png");
		File destination= new File(dest);
		FileUtils.copyFile(source,destination );
	
		return dest;
		}
	catch(Exception e){
		System.out.println("error while taking screen shot"+e.getMessage());
		return e.getMessage();
	}
		
	
	}
}
