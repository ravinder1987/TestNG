package Actions;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;


import PageObjects.branchflow;



public class branchflowaction {
	
	public static void execute(WebDriver driver,List<HashMap<String,String>> map,int index)
	{   
	    
	    branchflow.newbranchbutton.click();
		branchflow.branchname.sendKeys(map.get(index).get("Branchname"));
		branchflow.address1.sendKeys(map.get(index).get("address1"));
		branchflow.address2.sendKeys(map.get(index).get("address2"));
		branchflow.address3.sendKeys(map.get(index).get("address3"));
		branchflow.gipcode.sendKeys(map.get(index).get("zipcode"));
		branchflow.country.selectByVisibleText(map.get(index).get("country"));
	   branchflow.state.selectByVisibleText(map.get(index).get("state"));
	 branchflow.city.selectByVisibleText(map.get(index).get("city"));
		
		
		
	}

}
