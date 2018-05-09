package PageObjects;




import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class branchflow {
	
	
	@FindBy(how=How.ID, using="BtnNewBR")
	public static WebElement newbranchbutton;
	
	@FindBy(how=How.ID, using="txtbName")
	public static WebElement branchname;
	
	@FindBy(how=How.ID, using="txtAdd1")
	public static WebElement address1;
	
	@FindBy(how=How.ID, using="Txtadd2")
	public static WebElement address2;
	
	@FindBy(how=How.ID, using="txtadd3")
	public static WebElement address3;
	
	@FindBy(how=How.ID, using="txtArea")
	public static WebElement area;
	
	@FindBy(how=How.ID, using="txtZip")
	public static WebElement gipcode;
	
	@FindBy(how=How.XPATH,using="//*[@id='lst_counrtyU']")
	public static  Select country;
	
	@FindBy(how=How.XPATH, using="//*[@id='lst_stateI']")
	public static Select state;

	
	@FindBy(how=How.XPATH, using="//*[@id='lst_cityI']")
	public static Select city;
	
	@FindBy(how=How.ID, using="btn_insert")
	public static WebElement submit;
}
