package PageLibarary;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="folder",//it is path of featurefiles

tags="@sanity",//if you want execute only one feature file or one scenario we can use this if you want exclude use"~@sanity"

glue={"PageLibarary"}, //path of stepdefinition files

format={"html:target/cucumber-html-report"} // to genrate the html report
//monochrome=true// it will display the console output in more readable format
//strict=true,//it will check if step is not defined in stepdefinition file
//dryRun=false //it will check the  mapping is proper  between feture file and stepdefinition file

)
public class TestRunner {

	

}
