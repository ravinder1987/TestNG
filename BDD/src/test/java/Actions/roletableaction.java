package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebTable.BDDwebtable;

public class roletableaction {

	public static void execute(WebDriver driver){
		BDDwebtable.webtableautomation(driver,"edit",By.id("DGRoles"),"50");
	}
}
