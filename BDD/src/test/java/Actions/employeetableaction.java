package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebTable.BDDwebtable;

public class employeetableaction {
	
	public static void execute(WebDriver driver){
		BDDwebtable.webtableautomation(driver,"edit",By.id("DGBanker"),"4072");
	}

}
