package ravinder;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import screencapturing.utility;

public class TESTNGdemo{
	ExtentReports extent;
	ExtentTest logger;
	WebDriver ravi; 
	WebElement e;
	
	@Test(priority=1)
	public void launch()
	{  
		extent = new ExtentReports("D:\\seleniumclass\\eclipse neon\\automation testing\\TestNG\\reports\\report.html");
		logger=extent.startTest("Starting test");
	
		System.setProperty("webdriver.chrome.driver","D:\\seleniumclass\\chromedriver.exe");
	  ravi=new ChromeDriver();
	  
		ravi.get("http://www.newtours.demoaut.com/");
		logger.log(LogStatus.INFO, "application up and running");
		
      System.out.println("LOGIN SUCCESSFUL");
      logger.log(LogStatus.INFO, "succesfully login to applicatiomn");
	}
	
	
	@Test(priority=4)
	public void logout()
	{
	ravi.close();
	logger.log(LogStatus.PASS, "logout succesfully");
	System.out.println("LOGOUT SUCCESFUL");
	ravi.get("D:\\seleniumclass\\extentreport\\AdvanceReport.html");
	}
	
	@AfterMethod
	public void teardown(ITestResult result) throws IOException
	{
	 if(result.getStatus()==ITestResult.FAILURE)
	 { 
		 String screen_path =utility.captureScreenshot(ravi,result.getName());
		 //String image=logger.addScreenCapture(screen_path);
		 //logger.log(LogStatus.FAIL, image);
		 logger.log(LogStatus.INFO, "Snapshot below: " + logger.addScreenCapture("screen_path"));
		 
	 }
	 extent.endTest(logger);
	 extent.flush();
	}
	
/*	
	@Test(dataProvider="testdata1",priority=1)
      public void him() {
	  System.out.println("Him");}*/
  
	
	@Test(dataProvider="testdata",priority=2)
	  public void regfields1(String fname, String lname,String Phoneno,String email ) throws InterruptedException {
		ravi.findElement(By.linkText("REGISTER")).click();
		ravi.findElement(By.name("firstName")).sendKeys(fname);
		ravi.findElement(By.name("lastName")).sendKeys(lname);
		ravi.findElement(By.name("phone")).sendKeys("123456");
		ravi.findElement(By.id("userName")).sendKeys("ravinderreddy.yadla@gmail.com");
		Thread.sleep(5000);
		
		Assert.assertEquals(123455, 123456);
		logger.log(LogStatus.PASS, "FIRST FOUR values correctly given");
	}
	
	@Test(priority=3)
	public void regfileds2() throws InterruptedException {
		
		ravi.findElement(By.name("address1")).sendKeys("akruthi aura springs, b-308");
		ravi.findElement(By.name("address2")).sendKeys("whitefield");
		Thread.sleep(5000);
	    Assert.assertEquals(123456, 12345);
	    logger.log(LogStatus.PASS, "address deatill or given coreectly");
	}
		
	  
  @DataProvider(name= "testdata")
  public Object[][] readExcel() throws BiffException, IOException{
	  File f=new File("D:\\seleniumclass\\coding\\TESTNG PROJECT\\TESTNG.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);
		int rows=rsh.getRows();
		int columns= rsh.getColumns();
		String data[][]= new String[rows][columns];
		for(int i=0;i<rows;i++)
		{
		for(int j=0;j<columns;j++)
			{
				Cell c= rsh.getCell(j,i);
				data[i][j]=c.getContents();		
			}	
			}
		return data;
		}
  }

	  
  

