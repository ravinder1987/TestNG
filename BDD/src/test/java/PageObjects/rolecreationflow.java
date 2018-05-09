package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class rolecreationflow {

	@FindBy(how=How.ID, using="btnRoles")
	public static WebElement NewRolebutton;
	
	@FindBy(how=How.ID, using="txtRname")
	public static WebElement Rolename;
	
	@FindBy(how=How.ID, using="txtRDesc")
	public static WebElement Roledesc;
	
	@FindBy(how=How.XPATH, using="//*[@id='lstRtypeN']")
	public static Select Roletype;
	
	@FindBy(how=How.ID, using="btninsert")
	public static WebElement rolesubmit;
}

