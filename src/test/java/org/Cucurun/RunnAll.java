package org.Cucurun;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile\\MyNewProject.feature", glue = "www.MyProject",dryRun = false, 
				strict= false , plugin = {
		"html:C:\\Users\\santhoshkumar p\\Downloads\\karthik java testing\\SampleCucumber\\Reports\\htmlReport",
		"json:C:\\Users\\santhoshkumar p\\Downloads\\karthik java testing\\SampleCucumber\\Reports\\jsonReport\\ubuy.json",
		"junit:C:\\Users\\santhoshkumar p\\Downloads\\karthik java testing\\SampleCucumber\\Reports\\xmlReport\\ubuy.xml" ,
		
		
		})
public class RunnAll {
	@AfterClass
	public static void afterAllScenario() {
		JvmReport.generateJvmReport(
				"C:\\Users\\santhoshkumar p\\Downloads\\karthik java testing\\SampleCucumber\\Reports\\jsonReport\\ubuy.json");
	}
}
