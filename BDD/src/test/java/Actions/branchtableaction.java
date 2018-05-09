package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import WebTable.BDDwebtable;

public class branchtableaction {
	public static void execute(WebDriver driver){
		BDDwebtable.webtableautomation(driver,"edit",By.id("DG_bankdetails"),"105");
	}
	
}
