package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class branchbutton {
	@FindBy(how=How.XPATH, using="//img[@src='images/Branches_but.jpg']")
	public static WebElement branchbutton;
}
