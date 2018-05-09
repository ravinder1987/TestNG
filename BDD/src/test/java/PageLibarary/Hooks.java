package PageLibarary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
public static WebDriver driver;
@Before
public static void callbefore(){
		
		
		System.out.println("call browser");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

}
@After
public static void closebrowser(Scenario  s){
	if(s.isFailed()){
		TakesScreenshot screen=(TakesScreenshot)driver;
		
		byte[] screenshot=screen.getScreenshotAs(OutputType.BYTES);
		
		s.embed(screenshot, "image/png");
		s.write("test is failed");
	}
	else{
		s.write("test is passed");
		
	}
	driver.close();
}

}
