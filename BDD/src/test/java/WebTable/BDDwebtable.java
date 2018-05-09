package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BDDwebtable {
static boolean tag=false;
	
	public static void webtableautomation(WebDriver driver,String operation,By prop,String id){
		
			
			boolean status=false;
			WebElement table=driver.findElement(prop);
			List<WebElement> rows=table.findElements(By.tagName("tr"));
			String pagelinks[]=rows.get(rows.size()-1).getText().split(" ");
			for(int i=1;i<pagelinks.length;i++ ){
				
				table=driver.findElement(prop);
				rows=table.findElements(By.tagName("tr"));
				for(WebElement row:rows){
					List<WebElement> colums=row.findElements(By.tagName("td"));
					for(WebElement col:colums){
						if(col.getText().matches(id)){
							if(operation.equalsIgnoreCase("edit")){
								colums.get(colums.size()-2).findElement(By.tagName("a")).click();
								}
							else if(operation.equalsIgnoreCase("delete")){
								colums.get(colums.size()-1).findElement(By.tagName("a")).click();
								}
							else{
								System.out.println("operationfailed");
							}
							tag=true;
							break;	
							}
							
						
					}if(tag==true){
						break;
					}
					}
			    	if(tag==true){
				         break;
			          }
				try {
					if(pagelinks[i].contains("...") && status==true){
						driver.findElement(By.xpath("//a[text()='...'][2]")).click();
						}
					else{
						table.findElement(By.linkText(pagelinks[i])).click();
						}
				} catch (Exception e) {
				
					e.printStackTrace();
				}
			

			if(pagelinks[i].contains("...")){
				status=true;
				webtableautomation(driver, operation, prop, id);
			}
			}
	
	}
	}
	



