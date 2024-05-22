package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefiles/employeereg.feature",glue = "stepdefinitions",
dryRun = false,plugin = {"pretty","html:testreports/empregreport.html"})
public class EmployeeRegTest extends AbstractTestNGCucumberTests 
{

}
