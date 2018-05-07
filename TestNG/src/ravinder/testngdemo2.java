package ravinder;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class testngdemo2 {
  
@Test(groups={"sanity","regression"},priority=1)
  public void login() {
	  System.out.println("login succesful");
  }
@Test(groups={"sanity","regression"},priority=2,dependsOnMethods="login")
	  public void afterlogin1stpage() {
		  System.out.println("afterlogin1stpage succesful");
	  }
@Test(groups={"sanity"},priority=3)
	  public void afterlogin2ndpage() {
		  System.out.println("afterlogin2rdpage succesful");
	  }
@Test(groups={"sanity"},priority=4)
	  public void afterlogin3rdpage() {
		  System.out.println("afterlogin3rdpage succesful");
	  }
@Test(groups={"regression"},priority=5)
public void afterlogin4rdpage() {
	  System.out.println("afterlogin3rdpage succesful");
}
  @BeforeClass
  public void beforeMethod() {
	  System.out.println("launching application  succesful");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" taken screen shot succesfully ");
  }

  

  @AfterClass
  public void afterClass() {
	  System.out.println(" succesfully logout");
  }

}
